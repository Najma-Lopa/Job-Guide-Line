package com.example.jobguideline;//package com.example.combinepjt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.List;

public class PieWorkspace {


    @FXML
    private Button backFromWorkspace;

    @FXML
    private PieChart pieChartWorkspace;



    @FXML
    public void initialize() {
        // Add data to the PieChart
        pieChartWorkspace.getData().addAll(
                new PieChart.Data("Solving skill", 20),
                new PieChart.Data("Education", 25),
                new PieChart.Data("technical skill ", 35),
                new PieChart.Data("Communication", 10),
                new PieChart.Data("Experience", 10)

        );
        updatePieChartLabelsWithPercentage(pieChartWorkspace.getData());
    }

    // Method to update PieChart labels with percentage
    private void updatePieChartLabelsWithPercentage(List<PieChart.Data> pieData) {
        double total = 0;
        for (PieChart.Data data : pieData) {
            total += data.getPieValue();
        }

        for (PieChart.Data data : pieData) {
            double percentage = (data.getPieValue() / total) * 100;
            data.setName(String.format("%s: %.1f%%", data.getName(), percentage));
        }
    }
    @FXML
    void backFromWorkspaceOnAction(ActionEvent event) {

        try {
            FXMLLoader root=new FXMLLoader(list.class.getResource("list.fxml"));
            Scene scene=new Scene(root.load());
            Stage stage=(Stage)backFromWorkspace.getScene().getWindow();
            stage.setTitle("MY JAVA FX");
            stage.setScene(scene);
            stage.show();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
