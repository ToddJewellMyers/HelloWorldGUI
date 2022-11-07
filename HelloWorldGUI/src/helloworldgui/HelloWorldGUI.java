/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldgui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author michelle
 */
public class HelloWorldGUI extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button btn = new Button();
        
        HBox nameBox = new HBox(10);
        
        Label label = new Label("Name: ");
        
        TextField tf = new TextField("<Type your name here>");
        tf.setOnAction(e -> {
            btn.fire(); // programmatically clicks the button
        });

        btn.setText("Say Hello");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // Alert dialog code is from https://code.makery.ch/blog/javafx-dialogs-official/
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Hello");
                alert.setHeaderText(null);
                alert.setContentText("Hello, " + tf.getText() + "!");

                alert.showAndWait();
            }
        });

        VBox root = new VBox(10);
        nameBox.getChildren().addAll(label, tf);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.getChildren().addAll(nameBox, btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
