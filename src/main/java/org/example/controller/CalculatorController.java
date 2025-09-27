package org.example.controller;

import org.example.model.Calculator;

public class CalculatorController {

    private final Calculator calculator;

    public CalculatorController() {
        this.calculator = new Calculator();
    }

    public double handleOperation(String operation, double a, double b) {
        return switch (operation) {
            case "add" -> calculator.add(a, b);
            case "subtract" -> calculator.subtract(a, b);
            default -> throw new IllegalArgumentException("Invalid operation: " + operation);
        };
    }
}
