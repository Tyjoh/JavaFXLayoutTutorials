package com.tyjohtech;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class BorderPaneExample {

    public static BorderPane createExample(){
        BorderPane borderPane = new BorderPane();
        borderPane.getStyleClass().add("bg-1");
        borderPane.setPadding(new Insets(5));

        Label top = createLabel("Top", "bg-2");
        top.setPrefHeight(100);
        borderPane.setTop(top);

        Label left = createLabel("Left", "bg-3");
        left.setPrefWidth(150);
        left.setMaxHeight(200);
        BorderPane.setAlignment(left, Pos.BOTTOM_LEFT);
        borderPane.setLeft(left);

        Label center = createLabel("Center", "bg-4");
        center.setMinWidth(250);
        center.setMaxWidth(450);
        center.setMaxHeight(200);
        BorderPane.setAlignment(center, Pos.TOP_CENTER);
        borderPane.setCenter(center);

        Label right = createLabel("Right", "bg-5");
        right.setPrefWidth(75);
        borderPane.setRight(right);

        Label bottom = createLabel("Bottom", "bg-6");
        borderPane.setBottom(bottom);

        return borderPane;
    }

    private static Label createLabel(String text, String styleClass){
        Label label = new Label(text);
        label.getStyleClass().add(styleClass);
        BorderPane.setMargin(label, new Insets(5));
        label.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        return label;
    }

}
