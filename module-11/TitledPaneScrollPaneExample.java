/** File: TitlePaneScrollPaneExample.java
This file demonstrates the use of a TitledPane and ScrollPane in JavaFX.
It creates a VBox with multiple labels and places it inside a ScrollPane.
The ScrollPane is then placed inside a TitledPane.
The TitledPane is added to the main layout.
Jacob Cannamela
CSD402 - Assignment 11
Date: 2025-03-02
**/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TitledPaneScrollPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creating a VBox to hold multiple labels with content
        VBox contentBox = new VBox(10);
        for (int i = 1; i <= 20; i++) {
            contentBox.getChildren().add(new Label("Item " + i + " - blah blah blah blank filler data."));
        }
        
        // Creating a ScrollPane to wrap around the VBox
        ScrollPane scrollPane = new ScrollPane(contentBox);
        scrollPane.setFitToWidth(true);
        
        // Creating a TitledPane and placing the ScrollPane inside
        TitledPane titledPane = new TitledPane("testing expansion", scrollPane);
        titledPane.setExpanded(true);
        
        // Creating the main layout
        VBox root = new VBox(10, titledPane);
        root.setStyle("-fx-padding: 20;");
        
        // Setting up the scene and stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("JavaFX examples for professor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
