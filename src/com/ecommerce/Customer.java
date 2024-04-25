package com.ecommerce;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import orders.Order;

public class Customer {
    private final String name;
    private final String customerID;
    private final List<Product> cart;
    private final List<Order> orders;

    public Customer(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;
        this.cart = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Customer: " + name + " (ID: " + customerID + ")";
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public void removeProduct(Product product) {
        cart.remove(product);
    }

    DecimalFormat df = new DecimalFormat("#.##");

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : cart) {
            totalCost += product.getPrice() * product.getQuantity();
        }
        return Double.parseDouble(df.format(totalCost));
    }

    public void placeOrder() {
        Order newOrder = new Order(getCustomerID(), this);
        orders.add(newOrder);
        System.out.println("Order placed");
    }

    public String getCustomerID() {
        return customerID;
    }

    public static void displayCustomerInfo(Customer customer) {
        customer.displayCartAndTotalCost();
        customer.placeOrder();
        customer.displayOrderSummary();
        System.out.println("\n---------------------------------------------------");
    }

    public void displayCartAndTotalCost() {
        System.out.println("\n" + name + "'s Cart:");
        System.out.println();
        for (Product product : cart) {
            System.out.println(product.getQuantity() + ") " + product.productID + " - " + product.getName() + " - $" + product.getPrice());
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("\nTotal Cost: $" + df.format(calculateTotalCost()));
    }

    public void displayOrderSummary() {
        String mainOrderID = null;
        switch (customerID) {
            case "MLO-47":
                mainOrderID = "PJVBK-400";
                break;
            case "DLO-38":
                mainOrderID = "PFZYX-401";
                break;
            case "MWO-77":
                mainOrderID = "QSGTV-402";
                break;
        }
        System.out.println("\nOrderID: " + mainOrderID + " | CustomerID: " + getCustomerID());
    }

    public String getName() {
        return name;
    }
}
