package com.tyjohtech;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class AnchorPaneExample {

    public static AnchorPane createExample(){
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getStyleClass().add("bg-1");

        Label topLeft = createLabel("Top left", "bg-2");
        anchorPane.getChildren().add(topLeft);

        Label bottomRight = createLabel("Bottom right", "bg-3");
        anchorPane.getChildren().add(bottomRight);
        AnchorPane.setBottomAnchor(bottomRight, 0.0);
        AnchorPane.setRightAnchor(bottomRight, 0.0);

        Label bottomCenter = createLabel("Bottom center", "bg-4");
        anchorPane.getChildren().add(bottomCenter);
        AnchorPane.setBottomAnchor(bottomCenter, 0.0);
        AnchorPane.setLeftAnchor(bottomCenter, 100.0);
        AnchorPane.setRightAnchor(bottomCenter, 100.0);

        Label center = createLabel("Center", "bg-5");
        anchorPane.getChildren().add(center);
        AnchorPane.setBottomAnchor(center, 150.0);
        AnchorPane.setTopAnchor(center, 100.0);
        AnchorPane.setLeftAnchor(center, 100.0);
        AnchorPane.setRightAnchor(center, 100.0);

        return anchorPane;
    }

    private static Label createLabel(String text, String styleClass){
        Label label = new Label(text);
        label.getStyleClass().add(styleClass);
        return label;
    }

}
