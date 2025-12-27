# Online Store System

A Java-based e-commerce backend simulation that manages the core logic of an online shopping platform.

This project demonstrates Object-Oriented Programming (OOP) principles by modeling the interactions between **Products**, **Customers**, and **Shopping Carts**. It simulates a real-world scenario where users can browse items, add/remove them from their cart, and checkout to generate a unique Order ID.## Key Features

* **Object-Oriented Design:** distinct classes for `Product`, `Customer`, and `Order` management.
* **Cart Management:**
    * **Add to Cart:** Users can select specific products by ID.
    * **Remove from Cart:** dynamically updates the cart total when items are removed.
* **Order Processing:**
    * Automatically calculates the final total cost of all items.
    * Generates a unique **Order ID** and **Customer ID** for every transaction.## Example Output

When running the `Main` class, the program simulates three distinct customer sessions:

```text
Martha Logan's Cart:
1) GB-17 - Gretchen Bag - $750.59
1) FM-27 - Fons Mirror Set - $152.89
1) HP-24 - Holden Print - $130.0

Total Cost: $1033.48
Order placed
OrderID: PJVBK-400 | CustomerID: MLO-47

---------------------------------------------------

Diego Luna's Cart:
1) JC-67 - Jackson's comb  - $50.28
1) LP-36 - Lounge Perfume - $24.98
1) HP-24 - Holden Print - $130.0

Total Cost: $205.26
Order placed
OrderID: PFZYX-401 | CustomerID: DLO-38
