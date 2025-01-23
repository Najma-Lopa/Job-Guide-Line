package com.example.jobguideline;//package com.example.combinepjt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.List;

public class PieTherap {


    @FXML
    private PieChart pieChartTherap;

    @FXML
    private Button backFromtherap;

    @FXML
    public void initialize() {
        // Add data to the PieChart
        pieChartTherap.getData().addAll(
                new PieChart.Data("Solving skill", 25),
                new PieChart.Data("CGPA", 20),
                new PieChart.Data("Knowledge of data structure ", 20),
                new PieChart.Data("Communication", 10),
                new PieChart.Data("Experience", 15),
                new PieChart.Data("Passion", 10)

        );
        updatePieChartLabelsWithPercentage(pieChartTherap.getData());
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
    void backFromtherapOnAction(ActionEvent event) {
        try {
            FXMLLoader root=new FXMLLoader(list.class.getResource("list.fxml"));
            Scene scene=new Scene(root.load());
            Stage stage=(Stage)backFromtherap.getScene().getWindow();
            stage.setTitle("MY JAVA FX");
            stage.setScene(scene);
            stage.show();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
