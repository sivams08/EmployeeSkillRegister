package com.niit.DaoSample.Dao;

import java.util.List;

import com.niit.DaoSample.Model.EmpModel;

public interface EmployeeDao {
public List<EmpModel> getAllEmployeeDetails();
public boolean addEmployee(EmpModel model);
public boolean deleteEmployee(int employeeId);
public boolean UpdateEmployee(EmpModel model);
public EmpModel getEmployeebyid(int employeeId);
}
