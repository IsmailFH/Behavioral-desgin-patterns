/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRATEGY;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class main extends Application {

    private Button buttonShow, buttonClear;
    private TextField textFieldshikel;
    private RadioButton radioButtonjd, radioButtonUSD, radioButtonEuro;
    private TextArea textArea;
    private context context;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        textFieldshikel = new TextField();
        textFieldshikel.setMinWidth(20);
        textFieldshikel.setPromptText("MID");
        

        radioButtonjd = new RadioButton("jd");
        radioButtonjd.setSelected(true);
        radioButtonUSD = new RadioButton("USD");
        radioButtonEuro = new RadioButton("Euro");
        ToggleGroup toggleGroup = new ToggleGroup();
        radioButtonjd.setToggleGroup(toggleGroup);
        radioButtonUSD.setToggleGroup(toggleGroup);
        radioButtonEuro.setToggleGroup(toggleGroup);
        VBox vBox1 = new VBox();
        vBox1.setSpacing(10);
        vBox1.setAlignment(Pos.BASELINE_LEFT);
        vBox1.getChildren().addAll(textFieldshikel,
                radioButtonjd, radioButtonUSD, radioButtonEuro);

        buttonShow = new Button("Show");
        buttonClear = new Button("Clear");
        HBox hBox1 = new HBox();
        hBox1.setSpacing(10);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.getChildren().addAll(buttonShow, buttonClear);
        MyEventHandler myEventHandler = new MyEventHandler();
        radioButtonjd.setOnAction(myEventHandler);
        radioButtonUSD.setOnAction(myEventHandler);
        radioButtonEuro.setOnAction(myEventHandler);
        buttonShow.setOnAction(myEventHandler);
        buttonClear.setOnAction(myEventHandler);
        textArea = new TextArea();
        textArea.setMaxWidth(300);
        VBox vBox2 = new VBox();
        vBox2.setSpacing(10);
        vBox2.setAlignment(Pos.CENTER);
        vBox2.getChildren().addAll(textArea, hBox1);

        pane.getChildren().addAll(vBox1, vBox2);
        Scene scene = new Scene(pane, 550, 300);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Strategy Design Pattern");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }

    private class MyEventHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {

            if (event.getSource() == buttonShow) {
                if (radioButtonjd.isSelected()) {
                    context = new context(new jd());
                } else if (radioButtonUSD.isSelected()) {
                    context = new context(new USD());
                } else if (radioButtonEuro.isSelected()) {
                    context = new context(new Euro());
                }

                textArea.appendText(
                        context.getBalance(
                                Double.parseDouble(textFieldshikel.getText())
                              )
                        + "\n"
                );
            } else if (event.getSource() == buttonClear) {
                textArea.setText("");
            }
        }
    }
}
