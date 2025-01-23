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

public class tigerIt {

    @FXML
    private Label about;

    @FXML
    private Label info;
    private Parent root;

    @FXML
    void previous(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("list.fxml"));
        root = loader.load();

        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void seepie(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tigerpie.fxml"));
        root = loader.load();
        tigeritpie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }
    void show(){
        about.setText("TigerIT is recognized for its excellence in key technologies, and efficient project management");
        info.setText("TigerIT typically looks for the following criteria for entry-level IT jobs:\n" + //
                        "\n" + //
                        "1.Educational Background: A bachelor's degree in computer science, software engineering, or a related field is often required or preferred. Candidates with equivalent experience might also be considered.\n" + //
                        "2.Technical Skills: Proficiency in programming languages like Java, C++, or Python is crucial. For more specialized roles, knowledge of databases (SQL), system design, and cloud platforms (e.g., AWS) is beneficial.\n" + //
                        "3.Certifications: Relevant IT certifications such as CompTIA Security+, AWS Certified Solutions Architect, or Google Cloud certifications can help candidates.\n" + //
                        "4.Soft Skills: Strong communication, teamwork, and problem-solving abilities are important. Analytical and organizational skills also play a key role in ensuring efficiency.​");

    }

}
