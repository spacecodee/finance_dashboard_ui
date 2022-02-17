package com.spacecodee.finance_dashboard.controller.dashboard;

import com.spacecodee.finance_dashboard.controller.components.buttons.ButtonIconLine;
import com.spacecodee.finance_dashboard.dto.components.ButtonIconLineDto;
import com.spacecodee.finance_dashboard.utils.AppMode;
import com.spacecodee.finance_dashboard.utils.AppUtils;
import com.spacecodee.finance_dashboard.utils.Dimensions;
import com.spacecodee.finance_dashboard.utils.Images;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private VBox bottomContainer;

    @FXML
    private VBox topContainer;

    private static final String URL = AppUtils.URL_COMPONENTS + "buttons/button_icon_line.fxml";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.buildTopContainer();
        this.buildBottomContainer();
    }

    private void buildTopContainer() {
        var fxmlLoaders = new FXMLLoader[6];

        try {
            for (int i = 0; i < fxmlLoaders.length; i++) {
                this.topContainer.getChildren().add(addButtonsIconLine(fxmlLoaders, AppMode.sideBarTopLightMode(), i));
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    private void buildBottomContainer() {
        var fxmlLoaders = new FXMLLoader[3];

        try {
            for (int i = 0; i < fxmlLoaders.length; i++) {
                this.bottomContainer.getChildren().add(addButtonsIconLine(fxmlLoaders, AppMode.sideBarBottomLightMode(), i));
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    private HBox addButtonsIconLine(FXMLLoader[] fxmlLoaders, ButtonIconLineDto[] listButtons, int i) throws IOException {
        ButtonIconLine buttonIconLine;
        fxmlLoaders[i] = new FXMLLoader();
        fxmlLoaders[i].setLocation(this.getClass().getResource(DashboardController.URL));
        HBox hBox = fxmlLoaders[i].load();
        buttonIconLine = fxmlLoaders[i].getController();

        buttonIconLine.getText().setText(listButtons[i].getText());

        if (listButtons[i].isPressed()) {
            Images.addIcon(listButtons[i].getUrlIconPressed(), buttonIconLine.getIcon());
            buttonIconLine.getText().getStyleClass().add("text_button_sidebar_pressed");
            Images.addIcon("horizontal-line.png", buttonIconLine.getIconLine());

            if (buttonIconLine.getText().getText().contains("Dark mode")) {
                buttonIconLine.getText().setText("Light mode");
            }

        } else {
            Images.addIcon(listButtons[i].getUrlIcon(), buttonIconLine.getIcon());
        }

        return hBox;
    }


}