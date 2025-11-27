package org.example.javafx_calculator_caseopgave;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField displayId;

    private int number1;
    private int number2;
    private int sum;
    StringBuilder equations = new StringBuilder();


    @FXML
    protected void onCalculateButton(ActionEvent event) {
        Button b = (Button) event.getSource();
        displayId.setText(displayId.getText() + b.getText());

        equations.append(b.getText());
    }


    @FXML
    protected void onButtonCalculator(ActionEvent event) {
        Button b = (Button) event.getSource();
        displayId.setText(displayId.getText() + b.getText());

        equations.append(b.getText());
    }

    @FXML
    protected void onButtonDeleteAll(ActionEvent event) {
        displayId.clear();
        equations.delete(0, equations.length());
    }



    @FXML
    private void onEqualButton() {
        calculateEquation();
    }



    private void calculateEquation() {
        if (equations.toString().contains("+")) {
            calculateAdd();
        }
        if (equations.toString().contains("-")) {
            calculateSubtraction();
        }
        if (equations.toString().contains("X")) {
            calculateMultiplycation();
        }
        if (equations.toString().contains("/")) {
            calculateDivision();
        }
    }



    private void calculateAdd() {
        for (int i = 0; i < equations.length(); i++) {
            if (equations.charAt(i) == '+') {
                number1 = Integer.parseInt(equations.toString().substring(0, i));
                number2 = Integer.parseInt(equations.toString().substring(i + 1));
            }
            sum = number1 + number2;
            displayId.clear();
            displayId.setText(displayId.getText() + sum);
        }
    }



    private void calculateSubtraction() {
        for (int i = 0; i < equations.length(); i++) {
            if (equations.charAt(i) == '-') {
                number1 = Integer.parseInt(equations.toString().substring(0, i));
                number2 = Integer.parseInt(equations.toString().substring(i + 1));
            }
            sum = number1 - number2;
            displayId.clear();
            displayId.setText(displayId.getText() + sum);
        }
    }



    private void calculateMultiplycation() {
        for (int i = 0; i < equations.length(); i++) {
            if (equations.charAt(i) == 'X') {
                number1 = Integer.parseInt(equations.toString().substring(0, i));
                number2 = Integer.parseInt(equations.toString().substring(i + 1));
            }
            sum = number1 * number2;
            displayId.clear();
            displayId.setText(displayId.getText() + sum);
        }
    }



    private void calculateDivision() {
        for (int i = 0; i < equations.length(); i++) {
            if (equations.charAt(i) == '/') {
                number1 = Integer.parseInt(equations.toString().substring(0, i));
                number2 = Integer.parseInt(equations.toString().substring(i + 1));
            }
            sum = number1 / number2;
            displayId.clear();
            displayId.setText(displayId.getText() + sum);
        }
    }
}
