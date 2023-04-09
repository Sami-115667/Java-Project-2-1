module com.example.hall_management {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.hall_management to javafx.fxml;
    exports com.example.hall_management;
}