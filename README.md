# Store Shopping Application

  The Store Shopping Application is a Java-based console application that simulates shopping in a store. The application allows users to create a shopping cart, add products to it, and calculate the total price considering product prices and discount deals and rules.

## Features
  - Add products (A, B, C, D, E) to the shopping cart.
  - Calculate the total price of the items in the cart.
  - Apply discount deals and rules to the total price based on specific conditions.


## Getting Started
### Prerequisites
  To run the Store Shopping Application, you need:

- Java Development Kit (JDK) 8 or later installed on your system.
- Basic understanding of the command line interface.

### Installation
  1. Clone this repository to your local machine:
   ` git clone https://github.com/TheMightyHet/StoreSim.git `
  2. Navigate to the project directory:
   ` cd StoreSim/src `

## Usage
### Running the Application
  To run the Store Shopping Application, follow these steps:
  
  1. Compile the Java source files:
     ` javac Store.java `
      
  2. Run the application with the desired cart items as command-line arguments. For example:
     ` java Store A A B C D `

### Example Input and Output
Example input:
` java Store A A B `
Example output:
`Total Price: 130 `

## Deals
The Store Shopping Application offers the following dynamic discount deals and rules:
  - **DealAC**: If two "A" products and one "C" product are purchased, the first "C" product is half-price.
  - **DealD**: When purchasing two "D" products, the third "D" product is free.
  - **DealDE**: If a "D" and an "E" product is in the same shopping car, the buyer will have to pay +130% of the total price.

## Extending the Application
The application is designed with extensibility in mind. To add new products or deals, follow these steps:
  1. **Adding New Products**:
     - Open the `Store.java` file.
     - In the `initializeProducts` method, add a new entry to the `products` map for the new product.
  2. **Adding New Deals**:
     - Create a new class that implements the `Deal` interface.
     - Implement the `applyDeal` method to define the discount rule for the new deal.
     - Open the `Store.java` file.
     - In the `initializeDeals` method, add a new entry to the `deals` map for the new deal.
