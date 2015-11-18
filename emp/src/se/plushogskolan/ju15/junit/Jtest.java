package se.plushogskolan.ju15.junit;

import se.plushogskolan.ju15.beans.EmployeeBean;
import se.plushogskolan.ju15.model.EmployeeModel;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Jtest {

	EmployeeBean employeebean = new EmployeeBean();
	EmployeeModel employeemodel = new EmployeeModel();
	
	// test  yearSalary
	@Test(timeout=10)
	public void testYearSalary(){
		employeebean.setMonthlySalary(5000);
		int salary = employeemodel.calculateYearlySalary(employeebean);
		assertEquals(60000,salary);
	}
	
	// test Netsalary
	@Test
	public void testNetSalary(){
		employeebean.setMonthlySalary(5000);
		int salary = employeemodel.calculateNetSalary(employeebean);
		assertEquals(37000,salary);
	}
	
}
