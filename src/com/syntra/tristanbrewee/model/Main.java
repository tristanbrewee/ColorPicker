package com.syntra.tristanbrewee.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static final String MAIN_WINDOW_PATH = "../fxmls/MainWindow.fxml";

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(MAIN_WINDOW_PATH));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Color picker game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
