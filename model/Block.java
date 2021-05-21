package model;

import controller.Controller;
import javafx.animation.TranslateTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Block extends Rectangle {
    public Block(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
        this.setFill(Color.WHITE);
    }

    public TranslateTransition moveBlock(double distanceVariation) {
        TranslateTransition transition = new TranslateTransition(Duration.millis(Controller.SPEED), this);
        transition.setByX(distanceVariation);
        return transition;
    }
}
