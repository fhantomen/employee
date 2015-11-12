package se.plushogskolan.ju15.consol;

import java.util.Scanner;
import se.plushogskolan.ju15.beans.EmployeeBean;
import se.plushogskolan.ju15.model.EmployeeModel;

public class ConsoleTest {

	public static void main(String[] args) {
		EmployeeModel employeemodel = new EmployeeModel();
		EmployeeBean employeebean = new EmployeeBean();
		int salary;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Ange m�nadsl�n."+"\n");
		salary=inputScanner.nextInt();
		inputScanner.close();
		employeebean.setMonthlySalary(salary);
		
		System.out.println("m�nadsl�nen �r: "+salary);

		
		System.out.println("�rsl�nen �r: "+employeemodel.calculateYearlySalary(employeebean));
		System.out.println("Bonusen blir: "+employeemodel.calculateAppraisal(employeebean));
	}

}
