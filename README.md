# Seminar 3 – Point of Sale System (IV1350)

This is a simple checkout system (POS) made in Java for the course IV1350 at KTH during spring 2025.  


## What the program does

The program simulates how a cashier works. You can:

- Start a sale  
- Register items (for example BigWheel Oatmeal)  
- See the total price and VAT  
- End the sale  
- Pay and get the change  
- Print a receipt  

Everything runs from hardcoded method calls in the `View` class. The output is shown in the terminal using `System.out`.

## How the code is organized

The project is split into different parts:

- `controller` – Connects the other parts  
- `model` – The main logic (like `Sale`, `Item`, and `Receipt`)  
- `integration` – Pretends to be systems like inventory and accounting  
- `view` – Simulates the user doing the checkout  
- `startup` – Has the `main` class that starts the whole program  

## Tests

I wrote some JUnit 5 tests to check that the program works.  
The tests are in the `test` folder and test important parts like `Controller`, `Sale`, and `ItemRegistry`.

## How to run

1. Clone this repo:  
   "git clone https://github.com/OsamaHaydar05/Sem3.git"

2. Open the project in VS code or another program

3. Run the `Main` class (inside `startup`) with Java and to try it
