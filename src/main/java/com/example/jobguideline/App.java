package com.example.jobguideline;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            // Update the path to include a leading "/"
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/jobguideline/welcome.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Job Guideline");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
