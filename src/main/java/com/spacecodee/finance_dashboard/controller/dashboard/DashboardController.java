package com.spacecodee.finance_dashboard.controller.dashboard;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashboardController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}