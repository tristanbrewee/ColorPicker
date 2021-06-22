package com.syntra.tristanbrewee.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MainWindowController {

    @FXML
    private Button btnStart;
    @FXML
    private AnchorPane rootPane;

    public void initialize(){
        btnStart.setStyle("-fx-background-color: transparent;");
        btnStart.setOnMouseEntered(e -> btnStart.setStyle("-fx-background-color: red; -fx-text-fill: black;"));
        btnStart.setOnMouseExited(e -> btnStart.setStyle("-fx-background-color: transparent; -fx-text-fill: red;"));
    }

    public void btnStartClicked() throws Exception{
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../fxmls/Game.fxml"));
        rootPane.getChildren().clear();
        rootPane.getChildren().addAll(newPane);
    }
}
