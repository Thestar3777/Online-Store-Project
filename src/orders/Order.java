package orders;

import com.ecommerce.Customer;

public class Order {
    private final String orderID;
    private final Customer customer;

    public Order(String orderID, Customer customer) {
        this.orderID = orderID;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "OrderID: " + orderID + " | Customer: " + customer.getName() + " (ID: " + customer.getCustomerID() + ")";
    }
}

