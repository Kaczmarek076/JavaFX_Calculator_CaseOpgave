package org.example.javafx_calculator_caseopgave;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 575, 600);
        stage.setTitle("CASIO MH-12");      //Setting the name of the application to "CASIO MH-14"
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);      //Removing the ability to resize the application

    }

}
