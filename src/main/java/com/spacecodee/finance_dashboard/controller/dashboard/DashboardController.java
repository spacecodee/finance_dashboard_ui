package com.spacecodee.finance_dashboard.controller.dashboard;

import com.spacecodee.finance_dashboard.controller.components.buttons.ButtonIconLine;
import com.spacecodee.finance_dashboard.dto.components.ButtonIconLineDto;
import com.spacecodee.finance_dashboard.utils.AppUtils;
import com.spacecodee.finance_dashboard.utils.Images;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

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

        var btnHome = new ButtonIconLineDto("Home", "home.png", "horizontal_line_dark.png");
        var btnCards = new ButtonIconLineDto("Cards", "cards_blue.png", "horizontal-line.png");
        var btnTransactions = new ButtonIconLineDto("Transactions", "transactions.png", "horizontal_line_dark.png");
        var btnCharts = new ButtonIconLineDto("Charts", "charts.png", "horizontal_line_dark.png");
        var btnCalendar = new ButtonIconLineDto("Calendar", "calendar.png", "horizontal_line_dark.png");
        var btnReceivers = new ButtonIconLineDto("Receivers", "receivers.png", "horizontal_line_dark.png");

        ButtonIconLineDto[] listButtons = {
                btnHome, btnCards, btnTransactions, btnCharts, btnCalendar, btnReceivers
        };

        try {
            for (int i = 0; i < fxmlLoaders.length; i++) {
                this.topContainer.getChildren().add(addButtonsIconLine(fxmlLoaders, listButtons, i));
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    private void buildBottomContainer() {
        var fxmlLoaders = new FXMLLoader[3];

        var btnLogOut = new ButtonIconLineDto("Log out", "sign-out.png", "horizontal_line_dark.png");
        var btnDarkMode = new ButtonIconLineDto("Dark mode", "dark-mode.png", "horizontal_line_dark.png");
        var btnSettings = new ButtonIconLineDto("Settings", "settings.png", "horizontal_line_dark.png");

        ButtonIconLineDto[] listButtons = {
                btnSettings, btnDarkMode, btnLogOut
        };

        try {
            for (int i = 0; i < fxmlLoaders.length; i++) {
                this.bottomContainer.getChildren().add(addButtonsIconLine(fxmlLoaders, listButtons, i));
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

        Images.addIcon(listButtons[i].getUrlIcon(), buttonIconLine.getIcon());
        Images.addIcon(listButtons[i].getUrlIconLine(), buttonIconLine.getIconLine());
        buttonIconLine.getText().setText(listButtons[i].getText());

        return hBox;
    }
}