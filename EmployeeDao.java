package com.cg.eis.pl;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface EmployeeDao {
	
	public String findInsuranceScheme(Integer salary, String designation,Employee employee);
	public List<Employee> getEmployeeDetails();

}
