module comspacecodee.finance_dashboard {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires java.desktop;


    //Opens
    opens com.spacecodee.finance_dashboard to javafx.fxml;
    opens com.spacecodee.finance_dashboard.controller.dashboard to javafx.fxml;
    opens com.spacecodee.finance_dashboard.controller.components.buttons to javafx.fxml;

    //Exports
    exports com.spacecodee.finance_dashboard;
    exports com.spacecodee.finance_dashboard.controller.dashboard;
    exports com.spacecodee.finance_dashboard.controller.components.buttons to javafx.fxml;
}