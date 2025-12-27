# Online Store System

A Java-based e-commerce backend simulation that manages the core logic of an online shopping platform.

This project demonstrates Object-Oriented Programming (OOP) principles by modeling the interactions between **Products**, **Customers**, and **Shopping Carts**. It simulates a real-world scenario where users can browse items, add/remove them from their cart, and checkout to generate a unique Order ID.

"Now features an **interactive command-line interface (CLI)** that accepts user input for a personalized shopping experience."## Key Features

* **Interactive CLI:** Users can enter their own name and custom ID to start a session.
* **Dynamic Inventory System:**
    * Displays a live list of available products and prices.
    * Allows users to search and add items by Product ID.
    * **Error Handling:** Detects invalid IDs and prompts the user to try again.
* **Smart Cart Management:**
    * Tracks items added to the cart in real-time.
    * Calculates the final total automatically upon checkout.
* **Order Generation:** Creates a unique, randomized **Order ID** for every successful transaction.## Demo

![ezgif com-video-to-gif-converter](https://github.com/user-attachments/assets/8b82e95f-c2b2-4b06-9fee-92aee18a3188)


## Usage

Run the program and follow the on-screen prompts to shop.

**Example Session:**

```text
Welcome to the Online Store!
----------------------------
Please enter your name: Stella
Please enter a custom User ID (e.g., U-100): u-100

Hello, Stella! Let's start shopping.

--- Available Products ---
GB-17 : Gretchen Bag ($750.59)
FM-27 : Fons Mirror Set ($152.89)
...

Enter the Product ID to add to your cart: gb-17
Success! Gretchen Bag was added to your cart.

Enter the Product ID to add to your cart: theio
Error: Product ID not found. Please try again.

Enter the Product ID to add to your cart: checkout

----------------------------
Processing your order...

Stella's Cart:
1) GB-17 - Gretchen Bag - $750.59
1) LP-36 - Lounge Perfume - $24.98

Total Cost: $775.57
Order placed
OrderID: ORD-5600 | CustomerID: u-100

```
## Author

- [@The_star3777](https://github.com/Thestar3777)

## Tech Stack

* **Language:** Java (JDK 22)
* **IDE:** IntelliJ IDEA
* **Version Control:** Git & GitHub
## Badges

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
