module com.example.onlinequizapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.onlinequizapplication to javafx.fxml;
    exports com.example.onlinequizapplication;
}