package com.example.w22comp1008gcw12;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println("Hello World");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}