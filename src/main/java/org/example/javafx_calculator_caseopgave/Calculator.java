package org.example.javafx_calculator_caseopgave;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import javafx.scene.control.TextField;

public class Calculator {

    @FXML
    private TextField displayId;

    private int number1;        //Instance variable to save the first number
    private int number2;        //Instance variable to save the secund number
    private double sum;         //Double variable to save the result of the equation
    StringBuilder equations = new StringBuilder();      //StringBuilder to save the equation


    /**
     * Button click to get the number from the numpad
     * And saving the number in the StringBuilder
     *
     * @param event
     */
    @FXML
    protected void onCalculateButton(ActionEvent event) {
        Button b = (Button) event.getSource();
        displayId.setText(displayId.getText() + b.getText());       //Setting the display to show the pressed numbers

        equations.append(b.getText());      //Append the numbers and the calculation operator into the StringBuilder
    }



    @FXML
    protected void Button1(ActionEvent event) {
        displayId.clear();
        displayId.setText("din mor = 80085");
    }


    /**
     * Button click to delete everything from both the display and resenting the StringBuilder
     *
     * @param event
     */
    @FXML
    protected void onButtonDeleteAll(ActionEvent event) {
        displayId.clear();      //Clearing the display
        equations.delete(0, equations.length());        //Resetting the StringBuilder
    }




    /**
     * Button click to delete the last char from the StringBuilder
     *
     * @param event
     */
    @FXML
    protected void onButtonDeleteLastChar(ActionEvent event) {
        equations.deleteCharAt(equations.length() - 1);     //Removing the last char from the StringBuilder
        displayId.setText(equations.toString());        //Displaying the number after the number has been deleted
    }




    /**
     * Button click to calculate the equation
     */
    @FXML
    private void onEqualButton() {
        if (equations.toString().contains("+")) {       //Checking if the StringBuilder contains a '+'
            calculateAdd();     //Methode call to add the two numbers
        }
        if (equations.toString().contains("-")) {       //Checking if the StringBuilder contains a '-'
            calculateSubtraction();     //Methode call to subtract the two numbers
        }
        if (equations.toString().contains("X")) {       //Checking if the StringBuilder contains a 'X'
            calculateMultiplycation();  //Methode call to multiply the two numbers
        }
        if (equations.toString().contains("/")) {       //Checking if the StringBuilder contains a '/'
            calculateDivision();        //Methode call to divide the two numbers
        }
    }




    /**
     * Methode to extract the two numbers from the StringBuilder
     * And adding the two numbers together and displaying the numbers
     */
    private void calculateAdd() {
        for (int i = 0; i < equations.length(); i++) {
            if (equations.charAt(i) == '+') {       //Finding the index of the calculation operator
                number1 = Integer.parseInt(equations.substring(0, i));      //Parsing the first number to an int
                number2 = Integer.parseInt(equations.substring(i + 1));     //Parsing the secund number to an int
            }
            if (number1 == 2 && number2 == 2) {
                displayId.setText("din mor");
            } else {
                sum = number1 + number2;        //Adding the two numbers to find result (sum)
                displayId.clear();
                displayId.setText(String.valueOf(sum));     //Setting the result (sum) to the display
            }
        }
    }




    /**
     * Methode to extract the two numbers from the StringBuilder
     * And subtracting the two numbers together and displaying the numbers
     */
    private void calculateSubtraction() {
        for (int i = 0; i < equations.length(); i++) {
            if (equations.charAt(i) == '-') {       //Finding the index of the calculation operator
                number1 = Integer.parseInt(equations.substring(0, i));      //Parsing the first number to an int
                number2 = Integer.parseInt(equations.substring(i + 1));     //Parsing the secund number to an int
            }
            sum = number1 - number2;
            displayId.clear();
            displayId.setText(String.valueOf(sum));     //Setting the result (sum) to the display
        }
    }




    /**
     * Methode to extract the two numbers from the StringBuilder
     * And multiplying the two numbers together and displaying the numbers
     */
    private void calculateMultiplycation() {
        for (int i = 0; i < equations.length(); i++) {
            if (equations.charAt(i) == 'X') {       //Finding the index of the calculation operator
                number1 = Integer.parseInt(equations.substring(0, i));      //Parsing the first number to an int
                number2 = Integer.parseInt(equations.substring(i + 1));     //Parsing the secund number to an int
            }
            sum = number1 * number2;
            displayId.clear();
            displayId.setText(String.valueOf(sum));     //Setting the result (sum) to the display
        }
    }




    /**
     * Methode to extract the two numbers from the StringBuilder
     * And dividing the two numbers together and displaying the numbers
     */
    private void calculateDivision() {
        for (int i = 0; i < equations.length(); i++) {
            if (equations.charAt(i) == '/') {       //Finding the index of the calculation operator
                number1 = Integer.parseInt(equations.substring(0, i));      //Parsing the first number to an int
                number2 = Integer.parseInt(equations.substring(i + 1));     //Parsing the secund number to an int
            }
            sum = (double) number1 / number2;
            displayId.clear();
            displayId.setText(String.valueOf(sum));     //Setting the result (sum) to the display
        }
    }
}
