package com.example.jobguideline;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class list {

    

    private Parent root;

    @FXML
    void backFromList(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("welcome.fxml"));
        root = loader.load();

        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }
    @FXML
    void bjit(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("bjit.fxml"));
        root = loader.load();

        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }


    @FXML
    void bdtask(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("bdtask.fxml"));
        root = loader.load();

        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void brainstation(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("brainstation.fxml"));
        root = loader.load();

        brainstation instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void cefalo(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cefalo.fxml"));
        root = loader.load();

        cefalo instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show();
    }

    @FXML
    void daffodil(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("defoddil.fxml"));
        root = loader.load();

        defoddil instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void dream71(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("dream71.fxml"));
        root = loader.load();

        dream71 instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show();
    }

    @FXML
    void enosis(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("enosis.fxml"));
        root = loader.load();

        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void kaz(ActionEvent event) {

    }

    @FXML
    void leadsoft(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("leadsoft.fxml"));
        root = loader.load();

        leadsoft instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void nascenia(ActionEvent event) {

    }

    @FXML
    void pridesys(ActionEvent event) {

    }

    @FXML
    void reve(ActionEvent event) {

    }

    @FXML
    void riseup(ActionEvent event) {

    }

    @FXML
    void selise(ActionEvent event) {

    }

    @FXML
    void softBDLimited(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("softBd.fxml"));
        root = loader.load();

        // Softbd instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        // instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void southTech(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("southTech.fxml"));
        root = loader.load();

        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void therap(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("therapBd.fxml"));
        root = loader.load();

        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void tiger(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tigerit.fxml"));
        root = loader.load();

        tigerIt instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void vivo(ActionEvent event) throws IOException {
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
    void workspace(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("workSpace.fxml"));
        root = loader.load();

        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

}
