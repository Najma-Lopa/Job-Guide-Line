package com.example.jobguideline;//package com.example.combinepjt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.List;

public class PieSoftBd{

    @FXML
    private PieChart pieChartSoftBd;

    @FXML
    private Button backFromSoftBd;

    @FXML
    public void initialize() {
        // Add data to the PieChart
        pieChartSoftBd.getData().addAll(
                new PieChart.Data("problem solving", 15),
                new PieChart.Data("CGPA", 30),
                new PieChart.Data("Technical skill", 40),
                new PieChart.Data("Communication", 10),
                new PieChart.Data("Experience", 15),
                new PieChart.Data("Adabtability", 5)
        );
        updatePieChartLabelsWithPercentage(pieChartSoftBd.getData());
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
    void backFromSoftBdOnAction(ActionEvent event) {
        try {
            FXMLLoader root=new FXMLLoader(list.class.getResource("list.fxml"));
            Scene scene=new Scene(root.load());
            Stage stage=(Stage)backFromSoftBd.getScene().getWindow();
            stage.setTitle("MY JAVA FX");
            stage.setScene(scene);
            stage.show();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
