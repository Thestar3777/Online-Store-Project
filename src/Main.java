import com.ecommerce.*;

import static com.ecommerce.Customer.displayCustomerInfo;

public class Main {
    public static void main(String[] args) {

        //Set the Products names and ID#s
        Product product1 = new Product("Gretchen Bag", "GB-17", 750.59, 1);
        Product product2 = new Product("Fons Mirror Set", "FM-27", 152.89, 1);
        Product product3 = new Product("Jones Makeup", "JM-17", 49.99, 1);
        Product product4 = new Product("Holden Print", "HP-24", 130.00, 1);
        Product product5 = new Product("Lounge Perfume", "LP-36", 24.98, 1);
        Product product6 = new Product("Jackson's comb ", "JC-67", 50.28, 1);

        //Set the Customer names and ID#s
        Customer customer1 = new Customer("Martha Logan", "MLO-47");
        Customer customer2 = new Customer("Diego Luna", "DLO-38");
        Customer customer3 = new Customer("Meryl Winslett", "MWO-77");

        //Martha Logan's Choices
        customer1.addProduct(product1);
        customer1.addProduct(product2);
        customer1.addProduct(product4);

        //Diego Luna's Choices
        customer2.addProduct(product3);
        customer2.addProduct(product6);
        customer2.addProduct(product5);
        customer2.addProduct(product4);
        customer2.removeProduct(product3);

        //Meryl Winslett Choices
        customer3.addProduct(product2);
        customer3.addProduct(product6);
        customer3.addProduct(product3);
        customer3.removeProduct(product2);

        //Display the information
        displayCustomerInfo(customer1);
        displayCustomerInfo(customer2);
        displayCustomerInfo(customer3);
    }
}
