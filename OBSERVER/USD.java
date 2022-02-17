/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBSERVER;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author hp
 */
public class USD extends VBox implements  Observer{
 private Subject subject;
    private TextField textField;
    private  Button button;

    public USD(Subject subject) {
        this.subject = subject;
         this.subject.attach(this);
         
               textField = new TextField();
textField.setPromptText("USD");
         button = new Button("Update");
         
          this.setSpacing(10);
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(textField, button);
        button.setOnAction(e->
         this.subject.setbalance(Double.parseDouble(textField.getText())*3.3)
        );
         
    }
    
    
    
    
    
    @Override
    public void update() {
          textField.setText((this.subject.getbalance()/3.3)+"");
    }
}
    