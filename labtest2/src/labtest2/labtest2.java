
package labtest2;

import java.util.Scanner;
import javafx.application.Application;

import javafx.application.Platform;

import javafx.geometry.HPos;

import javafx.geometry.Insets;

import javafx.geometry.Pos;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.control.TextField;

import javafx.scene.layout.GridPane;

import javafx.stage.Stage;
/**
 *
 * @author Umit Kilinc 101232721
 */
public class labtest2 extends Application {

private final TextField textF1 = new TextField();

private final TextField textF2 = new TextField();

private TextField textF3 = new TextField();

private TextField textF4 = new TextField();

private Button average = new Button("Find average");  

private Button highestNum = new Button("Find the highest number");

private Button lowestNum= new Button("Find the lowest number");

private Button Exit = new Button("Exit");

@Override

public void start(Stage Stage) throws Exception {

// Create UI

GridPane pane = new GridPane();

pane.setVgap(5);

pane.setHgap(15);

pane.add(new Label("Enter The First Number"), 0, 0);

pane.add(textF1, 1, 0);

pane.add(new Label("Enter The Second Number"), 0, 1);

pane.add(textF2, 1, 1);

pane.add(new Label("Enter The Third Number"), 0, 2);

pane.add(textF3, 1, 2);

pane.add(new Label("Result"), 0, 3);

pane.add(textF4, 1, 3);

pane.add(average, 0, 4);

pane.add(highestNum, 0, 5);

pane.add(lowestNum, 0, 6);


pane.add(Exit, 1, 5);

// Set UI properties

pane.setAlignment(Pos.CENTER);

textF1.setAlignment(Pos.BOTTOM_RIGHT);

textF2.setAlignment(Pos.BOTTOM_RIGHT);

textF3.setAlignment(Pos.BOTTOM_RIGHT);

textF4.setAlignment(Pos.BOTTOM_RIGHT);

textF4.setEditable(false);

average.setPrefWidth(200);

highestNum.setPrefWidth(200);

lowestNum.setPrefWidth(200);


Exit.setPrefWidth(100);

pane.setHalignment(average, HPos.CENTER);

pane.setHalignment(highestNum, HPos.CENTER);

pane.setHalignment(lowestNum, HPos.CENTER);


pane.setHalignment(Exit, HPos.CENTER);

pane.setPadding(new Insets(220, 220, 220, 220));

// Button clicks handle events

average.setOnAction(e -> findAverage());

highestNum.setOnAction(e -> highestNum());

lowestNum.setOnAction(e -> lowestNum());

Exit.setOnAction(e -> Exit());

// Create a scene and place it in the stage

Scene scene = new Scene(pane);

Stage.setTitle("Integer collection"); // Set stage title

Stage.setScene(scene); // Place the scene in the stage

Stage.show(); // Display stage

}

private void findAverage() {

int num1=Integer.parseInt(textF1.getText());

int num2=Integer.parseInt(textF2.getText());

int num3=Integer.parseInt(textF3.getText());

int result = (num1 + num2 + num3) / 3;

textF4.setText(String.valueOf(result));

}

private int highestNum() {

int num1=Integer.parseInt(textF1.getText());

int num2=Integer.parseInt(textF2.getText());

int num3=Integer.parseInt(textF3.getText());


if(num1 > num2 && num1 > num3){
       return num1;
}
else if(num2 > num1 && num2 > num3){
     return num2;
}
else{  return num3;}
      
/*textF4.setText(String.valueOf(result));
*/
}

private int lowestNum() {

int num1=Integer.parseInt(textF1.getText());

int num2=Integer.parseInt(textF2.getText());

int num3=Integer.parseInt(textF3.getText());

if(num1 < num2 && num1 < num3){
    return num1;
}
else if(num2 < num1 && num2 < num3){
    return num2;
}
else{return num3;}
    
//textF4.setText(String.valueOf(result));

}


private void Exit() {

Platform.exit();

}

public static void main(String[] args) {

Application.launch(args);

}
}