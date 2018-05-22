package com.niit.DaoSample.Dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DaoSample.Model.EmpModel;

import antlr.collections.List;

@Repository("employeedetails")
@Transactional
public class EmployeeImp implements EmployeeDao {
	@Autowired
	private SessionFactory sessionFact;
	
	public boolean addEmployee(EmpModel model) {
		// TODO Auto-generated method stub
		sessionFact.getCurrentSession().save(model);
		return true;
	}
	
	public boolean deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		EmpModel model = new EmpModel();
		model.setEmployeeId(employeeId);
		sessionFact.getCurrentSession().delete(model);
		return true;
	}
	
	public boolean UpdateEmployee(EmpModel model) {
		// TODO Auto-generated method stub
		sessionFact.getCurrentSession().update(model);
		return true;
	}
	
	public EmpModel getEmployeebyid(int employeeId) {
		// TODO Auto-generated method stub
		return (EmpModel) sessionFact.getCurrentSession().createQuery("from EmpModel where EMPLOYEEID="+employeeId).uniqueResult();
	}

	
	@SuppressWarnings("unchecked")
	public java.util.List<EmpModel> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return (java.util.List<EmpModel>) sessionFact.getCurrentSession().createQuery("from EmpModel").list();
	}

}
