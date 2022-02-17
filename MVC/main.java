/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author hp
 */
public class main extends Application{
    private Button buttonShow, buttonClear;
    private TextField textField_Name, textField_Address, textField_Date_Of_Birth,textField_Account_Number;
    private TextArea textArea;
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);        
        textField_Name = new TextField();
        textField_Name.setMinWidth(20);
        textField_Name.setPromptText("Name");
        
        textField_Address = new TextField();
        textField_Address.setMinWidth(20);
        textField_Address.setPromptText("Address");
        
        
        textField_Date_Of_Birth = new TextField();
        textField_Date_Of_Birth.setMinWidth(20);
        textField_Date_Of_Birth.setPromptText("Date Of Birth");
        
        textField_Account_Number = new TextField();
        textField_Account_Number.setMinWidth(20);
        textField_Account_Number.setPromptText("Account Number");
        
        VBox vBox1 = new VBox();
        vBox1.setSpacing(20);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.getChildren().addAll(textField_Name, textField_Address, textField_Date_Of_Birth,textField_Account_Number);
        
        buttonShow = new Button("View");
        buttonClear = new Button("Clear");
        HBox hBox1 = new HBox();
        hBox1.setSpacing(10);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.getChildren().addAll(buttonShow, buttonClear);
        MyEventHandler myEventHandler = new MyEventHandler();
        buttonShow.setOnAction(myEventHandler);
        buttonClear.setOnAction(myEventHandler);
        textArea = new TextArea();
        textArea.setMaxWidth(300);
        textArea.setMaxHeight(150);
        textArea.setPromptText("View");
        
        VBox vBox2 = new VBox();
        vBox2.setSpacing(30);
        vBox2.setAlignment(Pos.CENTER);        
        vBox2.getChildren().addAll(textArea, hBox1);
        
        pane.getChildren().addAll(vBox1,vBox2);        
        Scene scene = new Scene(pane, 550,400);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("MVC Design Pattern");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        
    }
    private class MyEventHandler implements EventHandler<ActionEvent>{
        
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == buttonShow){
                Stor Stor = new Stor();
                Stor.setName(textField_Name.getText());
                Stor.setAddress(textField_Address.getText());
                Stor.setDate_of_birth(textField_Date_Of_Birth.getText());
                Stor.setAccount_number(textField_Account_Number.getText());
                
                Controller controller = new Controller(Stor, new view());
                textArea.setText(controller.updateView());
                
                
            
            }
            else if(event.getSource() == buttonClear){
               textArea.setText("");
               textField_Name.setText("");
               textField_Address.setText("");
               textField_Date_Of_Birth.setText("");
               textField_Account_Number.setText("");
                
            }
        }        
    }    
}
