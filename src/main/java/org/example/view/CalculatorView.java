package org.example.view;

import org.example.controller.CalculatorController;

import java.util.Scanner;

public class CalculatorView {

    private final CalculatorController controller;

    public CalculatorView() {
        this.controller = new CalculatorController();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!");

        while (true) {
            System.out.println("Enter operation (add, subtract) or 'exit' to quit:");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                System.out.println("Enter first number: ");
                double a = Double.parseDouble(scanner.nextLine());

                System.out.println("Enter second number: ");
                double b = Double.parseDouble(scanner.nextLine());

                double result = controller.handleOperation(operation, a, b);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
