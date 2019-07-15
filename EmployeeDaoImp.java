package com.cg.eis.pl;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;

public class EmployeeDaoImp implements EmployeeDao {

	List<Employee> empList = new ArrayList();
	Employee employee = new Employee();

	

	@Override
	public String findInsuranceScheme(Integer salary, String designation,Employee employee) {
		String insuranceScheme = "";
		if(employee.getSalary()>5000 && employee.getSalary()<20000 && employee.getDesignation().equalsIgnoreCase("System Associate")) {
			insuranceScheme = "Scheme C";
			employee.setInsuranceScheme(insuranceScheme);
			empList.add(employee);
			System.out.println("Employee details added successfully");
			
		}
		else if(employee.getSalary()>=20000 && employee.getSalary()<40000 && employee.getDesignation().equalsIgnoreCase("Programmer")) {
			insuranceScheme = "Scheme B";
			employee.setInsuranceScheme(insuranceScheme);
			empList.add(employee);
			System.out.println("Employee details added successfully");

		}
		else if(employee.getSalary()>=40000 && employee.getDesignation().equalsIgnoreCase("Manager")) {
			insuranceScheme = "Scheme A";
			employee.setInsuranceScheme(insuranceScheme);
			empList.add(employee);
			System.out.println("Employee details added successfully");

		}
		else if(employee.getSalary()<=5000 && designation.equalsIgnoreCase("Clerk")) {
			insuranceScheme = "No Scheme";
			employee.setInsuranceScheme(insuranceScheme);
			empList.add(employee);
			System.out.println("Employee details added successfully");

		}
		else {
			System.out.println("No Scheme");
		}
		

		return insuranceScheme;
	}

	@Override
	public List<Employee> getEmployeeDetails() {
		return empList;
	}

}
