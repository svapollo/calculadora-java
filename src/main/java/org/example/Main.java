package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.example.view.CalculatorView;

import java.util.Map;

public class Main implements RequestHandler<Map<String, Object>, String> {

    @Override
    public String handleRequest(Map<String, Object> event, Context context) {
        CalculatorView view = new CalculatorView();
        return view.processEvent(event);
    }
}