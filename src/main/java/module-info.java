module org.example.javafx_calculator_caseopgave {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.javafx_calculator_caseopgave to javafx.fxml;
    exports org.example.javafx_calculator_caseopgave;
}