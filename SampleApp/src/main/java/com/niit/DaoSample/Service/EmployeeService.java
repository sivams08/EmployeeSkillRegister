package com.niit.DaoSample.Service;

import java.util.List;

import com.niit.DaoSample.Model.EmpModel;

public interface EmployeeService {
	public boolean addEmployeeservice(EmpModel model);
	public boolean deleteEmployeeservice(int employeeId);
	public boolean UpdateEmployeeservice(EmpModel model);
	public EmpModel getEmployeebyidservice(int employeeId);
	public List<EmpModel> SelectAllEmployeeDetails();
}
