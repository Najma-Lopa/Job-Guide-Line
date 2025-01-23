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

public class leadsoft {

    @FXML
    private Label about;

    @FXML
    private Label req;
    private Parent root;

    @FXML
    void seePieChart(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("leadsoftpie.fxml"));
        root = loader.load();
        leadsoftpie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); //
    }
    void show(){
        about.setText("TURN YOUR IDEAS INTO SUCCESSFUL PRODUCTS\r\n" + //
                        "We make your business better than others");
        req.setText("For an entry-level job at LeadSoft, the key requirements typically include:\n" + //
                        "\n" + //
                        "1. Education: A Bachelor's degree in Computer Science, Software Engineering, or a related field.\n" + //
                        "2. Technical Skills: Proficiency in programming languages such as .NET, ASP.NET, C#, and SQL, along with knowledge of object-oriented programming (OOP) and design patterns.\n" + //
                        "3. Soft Skills: Effective communication, teamwork, and problem-solving abilities.\n" + //
                        "4. Experience: Internships or relevant projects are often preferred but not always mandatory for entry-level roles.");
    }
}
