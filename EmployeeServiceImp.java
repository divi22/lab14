package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.pl.EmployeeDao;
import com.cg.eis.pl.EmployeeDaoImp;

public class EmployeeServiceImp implements EmployeeService{

	EmployeeDao dao = new EmployeeDaoImp();
	
	

	@Override
	public String findInsuranceScheme(Integer salary, String designation,Employee employee) {
		return dao.findInsuranceScheme(salary, designation,employee);
	}

	@Override
	public List<Employee> getEmployeeDetails() {
		return dao.getEmployeeDetails();
	}

}
