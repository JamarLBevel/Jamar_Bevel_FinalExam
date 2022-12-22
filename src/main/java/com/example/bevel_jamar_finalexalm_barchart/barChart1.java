package com.example.bevel_jamar_finalexalm_barchart;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class barChart1 extends Application {
    int projecti = 0;
    int quizi = 0;
    int midtermi = 0;
    int finalli = 0;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button enterButton = new Button("enter");
        TextField data = new TextField();
        int total = 0;
        HBox hbox = new HBox();
        hbox.getChildren().add(enterButton);
        hbox.getChildren().add(data);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        VBox vBox = new VBox();
        HBox barChart = new HBox();
        barChart.setAlignment(Pos.BOTTOM_CENTER);
        barChart.setSpacing(10);
        Rectangle Project = new Rectangle(200,250);Project.setFill(Color.RED);Project.setWidth(100);Project.setHeight(0);
        Rectangle Quiz = new Rectangle(400,250);Quiz.setFill(Color.BLUE);Quiz.setWidth(100);Quiz.setHeight(0);
        Rectangle Midterm = new Rectangle(600,250);Midterm.setFill(Color.GREEN);Midterm.setWidth(100);Midterm.setHeight(0);
        Rectangle Finall = new Rectangle(800, 250);Finall.setFill(Color.ORANGE);Finall.setWidth(100);Finall.setHeight(0);
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
            String[] textToData = data.getText().split(" ");
            int total = 0;
            for(String s : textToData){total += Integer.parseInt(s);};
            if (total == 100) {
                Project.setHeight(Integer.parseInt(textToData[0] + 0));
                Quiz.setHeight(Integer.parseInt(textToData[1] + 0));
                Midterm.setHeight(Integer.parseInt(textToData[2] + 0));
                Finall.setHeight(Integer.parseInt(textToData[3] + 0));
            }


            }
        };

        enterButton.setOnAction(event);
        barChart.getChildren().add(Project);barChart.getChildren().add(Quiz);barChart.getChildren().add(Midterm);barChart.getChildren().add(Finall);
        vBox.getChildren().add(barChart);
        Text info = new Text("enter data below in the order of project,quiz,midterm,final separated by spaces. if total is not 100% no chart will be shown");
        vBox.getChildren().add(info);
        vBox.getChildren().add(hbox);
        vBox.setAlignment(Pos.BOTTOM_CENTER);
        Scene scene = new Scene(vBox,1000,1000);
        primaryStage.setScene(scene);
        primaryStage.setTitle("bar chart");
        primaryStage.show();
    }
}
