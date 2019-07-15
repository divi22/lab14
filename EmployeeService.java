package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface EmployeeService {

	public String findInsuranceScheme(Integer salary, String designation,Employee employee);
	public List<Employee> getEmployeeDetails();

}
