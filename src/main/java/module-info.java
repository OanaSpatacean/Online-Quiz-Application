module com.example.onlinequizapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires nitrite;


    opens com.example.onlinequizapplication to javafx.fxml;
    exports com.example.onlinequizapplication;
    //exports controllers;
    //opens controllers to javafx.fxml;
    exports com.example.onlinequizapplication.controllers;
    opens com.example.onlinequizapplication.controllers to javafx.fxml;
    exports com.example.onlinequizapplication.exceptions;
    opens com.example.onlinequizapplication.exceptions to javafx.fxml;
}