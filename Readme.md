Fibonacci Calculator and Arithmetic Operations

This repository contains Java programs for performing basic arithmetic operations and generating the Fibonacci series up to a specified number of terms. The project includes three main components:

Calculator.java: Defines methods for arithmetic operations (addition, subtraction, multiplication, division) and Fibonacci series generation.

UserInput.java: Handles user input.

Main.java: Provides the main interface for user interaction.

Features

Arithmetic Operations

Addition

Subtraction

Multiplication

Division (Handles division by zero gracefully)

Fibonacci Series

Generates the Fibonacci series up to a specified number of terms.

Files Description

1. Calculator.java

Contains the core logic for:

Arithmetic operations.

Fibonacci series generation.

2. UserInput.java

Handles user input using the Scanner class and provides methods for:

Reading two integers for arithmetic operations.

Reading a single integer for generating the Fibonacci series.

3. Main.java

Provides a menu-driven interface that:

Prompts the user to select an operation.

Invokes appropriate methods from Calculator.java based on user input.

Displays the results.

How to Run

Prerequisites

Java Development Kit (JDK) installed.

Any IDE (e.g., IntelliJ, Eclipse) or terminal for execution.

Steps

Clone this repository:

git clone <repository-url>

Navigate to the project directory.

Compile all .java files:

javac Main.java UserInput.java Calculator.java

Run the program:

java Main

Example Usage

Menu Options

Upon running the program, you will see:

Select task to perform:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Fibonacci

Example Output

Input:

1
Enter the first number:
10
Enter the second number:
5

Output:
