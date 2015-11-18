package se.plushogskolan.ju15.javafx;

import se.plushogskolan.ju15.model.EmployeeModel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import se.plushogskolan.ju15.beans.*;

public class TestDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	
	}
		public void start (Stage mystage){ 
			
			EmployeeBean employeebean = new EmployeeBean();
			EmployeeModel employeeModel = new EmployeeModel();
			TextField input = new TextField();
			input.setPromptText("Ange m�nadsl�n");
			Label lbl = new Label();

Button btnYear = new Button ("get yearly salary");
btnYear.setOnAction(new EventHandler<ActionEvent>(){

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		employeebean.setMonthlySalary(new Integer(input.getText()).intValue());
		lbl.setText("�rsl�n: "+employeeModel.calculateYearlySalary(employeebean));
	}
});
	
Button btnAppresial = new Button("Appresial");
btnAppresial.setOnAction(new EventHandler<ActionEvent>() {

	@Override
	public void handle(ActionEvent event) {
		lbl.setText("Bonus: "+employeeModel.calculateAppraisal(employeebean));
		
	}
	
});

Button btnNetSalary = new Button ("NetSalary");
btnNetSalary.setOnAction(new EventHandler<ActionEvent>() {

	@Override
	public void handle(ActionEvent event) {
		lbl.setText("Net Salary: "+employeeModel.calculateNetSalary(employeebean));
		
	}
	
});
		

// Design
			FlowPane root = new FlowPane();
			HBox knappar = new HBox();
			knappar.getChildren().addAll(btnYear,btnAppresial,btnNetSalary);
			root.getChildren().addAll(knappar,input,lbl);
			Scene myscene = new Scene(root,400,400);
			mystage.setScene(myscene);
			mystage.show();
			
		}
	
	
	} // TestDemo slutklammer

