package se.plushogskolan.ju15.model;

import se.plushogskolan.ju15.beans.EmployeeBean;

public class EmployeeModel {
	   // Calculate the yearly salary of employee
	   public int calculateYearlySalary(EmployeeBean employeeBean){
	      int yearlySalary=0;
	      yearlySalary = employeeBean.getMonthlySalary() * 12;
	      return yearlySalary;
	   }
		
	   // Calculate the appraisal amount of employee
	   public int calculateAppraisal(EmployeeBean employeeBean){
	      int appraisal=0;
	      if(employeeBean.getMonthlySalary() < 10000){
	         appraisal = 500;
	      }
	      else if(employeeBean.getMonthlySalary() < 20000){
	         appraisal = 1000;
	      }
	      else {
	    	  appraisal = 2000;
	      }
	      return appraisal;
	   }
	}
