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

public class brainstation {

    @FXML
    private Label about;

    @FXML
    private Label req;
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
    void seePie(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("brainstationPie.fxml"));
        root = loader.load();
        brainstationpie2 instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    void show(){
        about.setText("Our Vision  :  " + "To be the fastest digital transformation and innovation partner by engaging global talents thus creating positive impact.");
        req.setText("To apply for an entry-level position at BrainStation23,\r\n" + //
                        "1.Candidates typically need a degree in a relevant field (such as computer science or software engineering)\r\n" + //
                        "2.Some knowledge or experience in software development, depending on the role. \r\n" + //
                        "3. We look for proficiency in programming languages (like Java, Python, or JavaScript) and familiarity with frameworks like Angular or React. \r\n" + //
                        "4.Strong problem-solving skills, a passion for technology, and a willingness to learn are also key.\r\n" + //
                        "5.They also emphasize collaboration and communication abilities for team-based projects​");
    }

}
