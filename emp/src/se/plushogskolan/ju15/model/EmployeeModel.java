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
	   
	   public int calculateNetSalary(EmployeeBean employeeBean){
		   
		   double netSalary;
		   double minTax;
		   double mediumTax;
		   double maxTax;
		   
		   
		   double yearSalary=calculateYearlySalary(employeeBean);
		   if (yearSalary<=37000 ){
			   minTax= yearSalary*0.7;
			netSalary= minTax;   
		   }
		   else if (yearSalary>37000 & yearSalary <=52000){
			   minTax= 37000*0.7;
			   mediumTax=(yearSalary-37000)*0.5;
			   netSalary=minTax+mediumTax;
		   }
		   else{
			   minTax= 37000*0.7;
			   mediumTax=15000*0.5;
			   maxTax= (yearSalary-52000)*0.45;
			   netSalary=minTax+mediumTax+maxTax;
		   }
		   return (int)netSalary;
	   }
	}
