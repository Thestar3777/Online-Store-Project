package com.ecommerce;

public class Product {
    private final String name;
    public final String productID;
    private final double price;
    private final int quantity;
    public Product(String name, String productID, double price, int quantity) {
        this.name = name;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Product: " + name + " (ID: " + productID + ", Price: $" + price + ", Quantity: " + quantity + ")";
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
}

