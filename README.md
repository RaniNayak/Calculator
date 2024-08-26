# Extensible Calculator in Java

This project implements a simple, extensible calculator in Java that supports multiple operations. The calculator is designed following key object-oriented principles, particularly the Open-Closed Principle, to ensure maintainability and extensibility.

## Objectives

- **Open-Closed Principle**: The calculator is designed so that it can be extended with new features (operations) without modifying the existing code.
- **Maintainability**: The code is structured in a way that makes it easy to maintain, understand, and test.
- **IoC Compatibility**: The design is compatible with Inversion of Control (IoC) environments, facilitating easy testing and dependency management.

## Features

1. **Basic Operations**: Supports basic arithmetic operations like addition, subtraction, multiplication, and division.
2. **Chaining Operations**: Allows chaining multiple operations on a single value, similar to the behavior of basic calculators.
3. **Extensibility**: New operations can be added without changing the existing codebase.
4. **Error Handling**: Gracefully handles invalid operations or input, ensuring robustness.
5. **Unit Testing**: Comprehensive unit tests verify both normal and edge cases.

## Requirements

- **Java 8 or higher**
- **JUnit** (for unit testing)

## How to Run
## 1.Using gradle command
./gradlew clean test

Report can be found at -
/Calculator/build/reports/tests/test/classes/CalculatorTest.html

## 2. Using IDE Test Runners
   Most IDEs provide built-in test runners that show which tests have been executed:

**IntelliJ IDEA**: When you run JUnit tests, the "Run" tool window will display the names of the tests that have run, along with their results (passed, failed, ignored).

**Eclipse**: Eclipse also provides a "JUnit" view where you can see the list of tests that have run, along with their status.
# Calculator
