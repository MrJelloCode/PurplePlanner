package com.purple_planner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




/**
 * JavaFX App super duper cool
 */
public class App extends Application {

   

    public static void main(String[] args){
        launch(args);
    }


    // Stops the warning given when the stage from javaFX is passed. 
     @SuppressWarnings("exports")
    @Override
    public void start(Stage stage) throws Exception {

        

        // Create the canvas so that it loads in home.fxml
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Scene scene = new Scene(root);
        // Show the user the canvas
        stage.setScene(scene);
        stage.show();

    

    }
}