package com.example.onlinequizapplication.controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.dizitart.no2.Nitrite;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        // Create a Nitrite database instance
        Nitrite db = Nitrite.builder()
                .filePath("/Users/Yoga/OneDrive/Desktop/Online-Quiz-Application/myNitriteDatabase.db")
                .openOrCreate();

        launch();

        // Close the Nitrite database instance when the application exits
        db.close();
    }
}