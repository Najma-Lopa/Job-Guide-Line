package com.example.jobguideline;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class cefalo {

    @FXML
    private Label about;

    @FXML
    private Label req;
    private Parent root;

    @FXML
    void SeePieChart(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cefalopie.fxml"));
        root = loader.load();
        cefalopie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); //
    }

    void show(){
        about.setText("The best employer for the best developers\r\n" + //
                        "Unique access to premium developers");
        req.setText("For an entry-level job at Cefalo, the main requirements typically include:\n" + //
                        "\n" + //
                        "1. Education: A Bachelor’s degree in Computer Science, Software Engineering, or related fields.\n" + //
                        "2. Technical Skills: Proficiency in modern web and mobile development technologies like Java, Spring Boot, JavaScript, React, Node.js, and cloud-based stacks.\n" + //
                        "3. Soft Skills: Strong communication, teamwork, and problem-solving abilities.\n" + //
                        "4. Experience: Internships or relevant coursework, though some positions may require additional experience.");
    }

}
