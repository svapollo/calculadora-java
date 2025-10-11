package org.example.view;

import org.example.controller.CalculatorController;

import java.util.Map;

public class CalculatorView {

    private final CalculatorController controller;

    public CalculatorView() {
        this.controller = new CalculatorController();
    }

    public CalculatorController getController() {
        return controller;
    }

    public String processEvent(Map<String, Object> event) {
        try {
            String operation = (String) event.get("operation");
            double a = Double.parseDouble(event.get("a").toString());
            double b = Double.parseDouble(event.get("b").toString());

            double result = controller.handleOperation(operation, a, b);
            return "Result: " + result;
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}