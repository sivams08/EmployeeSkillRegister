package com.niit.SampleApp;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

import com.niit.DaoSample.Model.EmpModel;
import com.niit.DaoSample.Service.EmployeeService;
import com.niit.DaoSample.config.configEmployee;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=configEmployee.class) 
public class TestEmployee {
	@Autowired
	private EmployeeService employeeservice;
	
	EmpModel model;
	@Before
	public void setUp() throws Exception 
	{
		 model=new EmpModel();
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void selectall(){
		
		List<EmpModel> employeeList = new ArrayList<EmpModel>();
		employeeList = employeeservice.SelectAllEmployeeDetails();
		for(EmpModel allemployee:employeeList)
		{
			System.out.println("Selectall Success");
		}
		assertEquals("Success",true,employeeList.size() !=0);
	}
	
	@Test
	public void Select()
	{
		model = new EmpModel();
		model = employeeservice.getEmployeebyidservice(1);
		assertEquals("Success",true,model!=null);
	}
	@Test(expected = org.hibernate.PropertyValueException.class)
	public void Adddata() 
	{
		model.setEmployeeId(3);
		model.setEmployeeName("Siva");
		model.setDateOfBirth("17/12/2012");
		model.setGender("M");
		model.setEmailid("ram08@gmmail.com");
		model.setPassword("sivams09@");
		model.setQualification("BE");
		model.setRole("HR");
		model.setMobileNo("997909161");
	    assertEquals("Success",true,employeeservice.addEmployeeservice(model));
	}
	
	/*@Test
	public void deletecheck()
	{
	    assertEquals("success",true,employeeservice.deleteEmployeeservice(1));
	}*/
	
	/*@Test
	public void selectdata()
	{
		//assertEquals
	}*/
	
	@Test
	public void Updatedata()
	{
		model=employeeservice.getEmployeebyidservice(2);
		model.setQualification("Bds");
		
		assertEquals("successfully updated",true,employeeservice.UpdateEmployeeservice(model));
	}
	
	/*@Test
	public void Selecbyall()
	{
		
	}*/
}
