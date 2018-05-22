package com.niit.DaoSample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.DaoSample.Dao.EmployeeDao;
import com.niit.DaoSample.Model.EmpModel;

import antlr.collections.List;

@Service
public class Employeeserviceimp implements EmployeeService {

	@Autowired
	private EmployeeDao employeedao;

	
	public boolean deleteEmployeeservice(int employeeId) {
		// TODO Auto-generated method stub
		return (employeedao.deleteEmployee(employeeId));
	}
	
	public boolean UpdateEmployeeservice(EmpModel model) {
		// TODO Auto-generated method stub
		return (employeedao.UpdateEmployee(model));
	}
	
	public EmpModel getEmployeebyidservice(int employeeId) {
		// TODO Auto-generated method stub
		return (employeedao.getEmployeebyid(employeeId));
	}

	
	public java.util.List<EmpModel> SelectAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return (java.util.List<EmpModel>) (employeedao.getAllEmployeeDetails());
	}

	
	public boolean addEmployeeservice(EmpModel model) {
		// TODO Auto-generated method stub
		return (employeedao.addEmployee(model));
	}

}
