package com.syntra.tristanbrewee.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class GameController {

    @FXML
    private Button btnRed;
    @FXML
    private Button btnYellow;
    @FXML
    private Button btnBlue;
    @FXML
    private Rectangle coloredShape;
    @FXML
    private Text score;

    public void initialize(){
        initializeRectangle();
        initializeButton(btnRed);
        initializeButton(btnYellow);
        initializeButton(btnBlue);
    }

    public void initializeRectangle(){
        int randomColor = (int)(Math.random() * 3);
        switch (randomColor){
            case 0:
                coloredShape.setFill(Color.RED);
                break;
            case 1:
                coloredShape.setFill(Color.YELLOW);
                break;
            case  2:
                coloredShape.setFill(Color.BLUE);
                break;
        }
    }

    private void initializeButton(Button button){
        String styleNormal = "";
        String styleHover = "";
        if (button.equals(btnRed)){
            styleNormal = "-fx-background-color: transparent; -fx-text-fill: red;";
            styleHover = "-fx-background-color: red; -fx-text-fill: black;";
        }
        else if (button.equals(btnYellow)){
            styleNormal = "-fx-background-color: transparent; -fx-text-fill: yellow;";
            styleHover = "-fx-background-color: yellow; -fx-text-fill: black;";
        }
        else {
            styleNormal = "-fx-background-color: transparent; -fx-text-fill: blue;";
            styleHover = "-fx-background-color: blue; -fx-text-fill: black;";
        }
        String finalStyleNormal = styleNormal;
        String finalStyleHover = styleHover;
        button.setStyle(styleNormal);
        button.setOnMouseEntered(e -> button.setStyle(finalStyleHover));
        button.setOnMouseExited(e -> button.setStyle(finalStyleNormal));
        button.setOnAction(e -> btnClicked(button));
    }

    private void btnClicked(Button button){
        int currentScore = Integer.parseInt(score.getText());
        if ((coloredShape.getFill().equals(Color.YELLOW) && button.equals(btnYellow)) ||
                (coloredShape.getFill().equals(Color.RED) && button.equals(btnRed)) ||
                (coloredShape.getFill().equals(Color.BLUE) && button.equals(btnBlue))){
            score.setText(String.valueOf(++currentScore));
        }
        else {
            score.setText(String.valueOf(--currentScore));
        }
        initializeRectangle();
    }
}
