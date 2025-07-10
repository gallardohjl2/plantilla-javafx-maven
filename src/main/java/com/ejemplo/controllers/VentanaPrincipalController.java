package com.ejemplo.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class VentanaPrincipalController {

    @FXML
    private void handleBoton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mensaje");
        alert.setHeaderText(null);
        alert.setContentText("¡Has hecho clic!");
        alert.showAndWait();
    }
}
