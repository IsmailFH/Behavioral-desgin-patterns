/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBSERVER;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application{  
    private Subject subject = new Subject();
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);         
       
     
        
        HBox hBox = new HBox();
        hBox.setSpacing(20);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(20, 20, 20, 20));
        hBox.setStyle("-fx-border-color: blue");
        
        JD jd = new JD(subject);
        USD usd = new USD(subject);
        EURO euro = new EURO(subject);
        
        hBox.getChildren().addAll(jd, usd,euro) ;
        
        pane.getChildren().addAll(hBox);        
        Scene scene = new Scene(pane, 700,400);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Obsever Design Pattern");
        primaryStage.show();
        
        
   
        
    }
    public static void main(String[] args) {
        launch(args);
        
    }
  
}
