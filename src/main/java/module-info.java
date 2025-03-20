module com.purple_planner {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.purple_planner to javafx.fxml;
    exports com.purple_planner;
}
