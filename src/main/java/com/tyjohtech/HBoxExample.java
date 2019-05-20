package com.tyjohtech;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class HBoxExample {

    public static HBox createExample(){
        HBox hbox = new HBox();
        hbox.getStyleClass().add("bg-1");
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);
        hbox.setPadding(new Insets(10));
        hbox.setFillHeight(true);

        Label l1 = new Label("Label 1");
        l1.getStyleClass().add("bg-2");
        l1.setMaxHeight(200);
        l1.setMaxWidth(300);
        HBox.setHgrow(l1, Priority.ALWAYS);

        Label l2 = new Label("Label 2");
        l2.getStyleClass().add("bg-3");
        l2.setMaxHeight(150);
        l2.setMaxWidth(200);
        HBox.setHgrow(l2, Priority.SOMETIMES);

        Label l3 = new Label("Label 3");
        l3.getStyleClass().add("bg-4");

        Label l4 = new Label("Label 4");
        l4.getStyleClass().add("bg-5");

        Label l5 = new Label("Label 5");
        l5.getStyleClass().add("bg-6");

        hbox.getChildren().addAll(l1, l2, l3, l4, l5);

        return hbox;
    }

}
