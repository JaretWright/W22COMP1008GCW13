module com.example.w22comp1008gcw12 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.w22comp1008gcw12 to javafx.fxml;
    exports com.example.w22comp1008gcw12;
}