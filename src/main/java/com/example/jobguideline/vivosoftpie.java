package com.example.jobguideline;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class vivosoftpie {

    @FXML
    private PieChart pie; 
    private Parent root;

    @FXML
    void previous(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("vivasoft.fxml"));
        root = loader.load();

        vivosoft instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("welcome.fxml"));
        root = loader.load();

        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void show() {
        // Clear any existing data from the PieChart
        pie.getData().clear();

        // Creating the data
        PieChart.Data slice1 = new PieChart.Data("Experience in Software Development", 20);
        PieChart.Data slice2 = new PieChart.Data("Relevant Degree", 25);
        PieChart.Data slice3 = new PieChart.Data("Proficiency in Programming Languages", 25);
        PieChart.Data slice4 = new PieChart.Data("Problem-Solving Skills", 15);
        PieChart.Data slice5 = new PieChart.Data("Communication & Teamwork", 15);

        pie.getData().addAll(slice1, slice2, slice3, slice4, slice5);

        // Calculate total value
        double total = 20 + 25 + 25 + 15 + 15;

        // Set data with percentage labels
        for (PieChart.Data data : pie.getData()) {
            double percentage = (data.getPieValue() / total) * 100;
            data.setName(data.getName() + " " + String.format("%.1f%%", percentage));
        }

        // Setting the title of the PieChart
        pie.setTitle("Entry-Level Job Criteria at Vivasoft");
    }
}
