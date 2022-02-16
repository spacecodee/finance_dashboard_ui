module comspacecodee.finance_dashboard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spacecodee.finance_dashboard to javafx.fxml;
    exports com.spacecodee.finance_dashboard;
    exports com.spacecodee.finance_dashboard.controller.dashboard;
    opens com.spacecodee.finance_dashboard.controller.dashboard to javafx.fxml;
}