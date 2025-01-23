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

public class vivosoft {

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
    void show(){
    about.setText("Vivasoft is a top-tier software outsourcing development company that offers premium solutions using the latest technology stacks.");
    info.setText("For an entry-level job at Vivasoft, the typical criteria include:\n" + //
                "\n" + //
                "1.Technical Skills: Proficiency in popular programming languages like Java, Python, JavaScript, and others.\n" + //
                "2.Education: A relevant degree in Computer Science or related fields.\n" + //
                "3.Soft Skills: Teamwork, professionalism, and a commitment to innovation are emphasized.\n" + //
                "4.Learning Mindset: A willingness to learn and adapt to new technologies.");
    }

    @FXML
    void SeePie(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("vivasoftpie.fxml"));
        root = loader.load();

        vivosoftpie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

}
