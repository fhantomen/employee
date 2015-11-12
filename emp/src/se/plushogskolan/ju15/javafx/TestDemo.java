package se.plushogskolan.ju15.javafx;

import se.plushogskolan.ju15.model.*;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import se.plushogskolan.ju15.beans.*;

public class TestDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	
	}
		public void start (Stage mystage){ 
			
			EmployeeBean employeebean = new EmployeeBean();

TextField input = new TextField();

Button btnYear = new Button ("get yearly salary");

			
			

// Design
			FlowPane root = new FlowPane();
			Scene myscene = new Scene(root,400,400);
			mystage.setScene(myscene);
			mystage.show();
			
		}
	
		
		
		
	} // TestDemo klammer

