package com.spacecodee.finance_dashboard.controller.dashboard;

import com.spacecodee.finance_dashboard.controller.components.buttons.ButtonIconLine;
import com.spacecodee.finance_dashboard.dto.components.ButtonIconLineDto;
import com.spacecodee.finance_dashboard.utils.Images;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DashboardController {
    @FXML
    private VBox bottomContainer;

    @FXML
    private VBox topContainer;

    public static final String URL_COMPONENTS = "/com/spacecodee/finance_dashboard/view/components/";

    public DashboardController() {
        this.buildTopContainer();
    }

    private void buildTopContainer() {
        var URL = DashboardController.URL_COMPONENTS + "buttons/button_icon_line.fxml";

        var fxmlLoaders = new FXMLLoader[3];
        var listButtons = new ArrayList<ButtonIconLineDto>() {
            {
                add(new ButtonIconLineDto(
                        "Log out", "@../../assets/icons/sign-out.png"
                ));
                add(new ButtonIconLineDto(
                        "Dark mode", "@../../assets/icons/dark-mode.png"
                ));
                add(new ButtonIconLineDto(
                        "Settings", "@../../assets/icons/settings.png"
                ));
            }
        };

        try {
            ButtonIconLine buttonIconLine;

            for (int i = 0; i < fxmlLoaders.length; i++) {
                fxmlLoaders[i] = new FXMLLoader();
                fxmlLoaders[i].setLocation(this.getClass().getResource(URL));
                HBox hBox = fxmlLoaders[i].load();

                buttonIconLine = fxmlLoaders[i].getController();

                Images.addImg(listButtons.get(i).getUrlImage(), buttonIconLine.getImgLine());
                buttonIconLine.getBtnBody().setText(listButtons.get(i).getText());
                this.topContainer.getChildren().add(hBox);
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}