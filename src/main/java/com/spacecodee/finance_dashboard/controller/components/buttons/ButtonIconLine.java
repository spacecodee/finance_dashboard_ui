package com.spacecodee.finance_dashboard.controller.components.buttons;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import lombok.Getter;
import lombok.Setter;

import java.net.URL;
import java.util.ResourceBundle;

public class ButtonIconLine implements Initializable {

    @Getter
    @Setter
    @FXML
    private Button btnBody;

    @Getter
    @Setter
    @FXML
    private HBox btnParent;

    @Getter
    @Setter
    @FXML
    private ImageView imgLine;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
