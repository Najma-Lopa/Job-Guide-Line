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

public class dream71 {

    @FXML
    private Label about;

    @FXML
    private Label req;
    private Parent root;

    @FXML
    void seePieChart(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("dream71pie.fxml"));
        root = loader.load();
        dream71pie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); //
    }
    void show(){
        about.setText("A leading Software Company Focusing on\r\n" + //
                        "E-Governance, Web Applications, Mobile Applications, Artificial intelligence and BlockChain.");
        req.setText("For an entry-level job at Dream 71 Bangladesh, the common requirements may include:\n" + //
                        "\n" + //
                        "1. Education: A Bachelor's degree in Computer Science, Software Engineering, or a related field.\n" + //
                        "2. Technical Skills: Proficiency in mobile app development, web development technologies (e.g., Java, Android, iOS, PHP, JavaScript, Laravel), and modern frameworks.\n" + //
                        "3. Experience: Internships, relevant projects, or part-time work in related fields.\n" + //
                        "4. Soft Skills: Strong communication skills, problem-solving, and a collaborative mindset.");
    }

}
