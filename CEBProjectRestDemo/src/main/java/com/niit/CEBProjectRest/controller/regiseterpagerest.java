package com.niit.CEBProjectRest.controller;

//import java.io.PrintWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.DaoSample.Model.EmpModel;
import com.niit.DaoSample.Service.EmployeeService;


@RestController
@RequestMapping("/api/employee")
@CrossOrigin(origins="http://Localhost:4200")
public class regiseterpagerest
{
 @Autowired
 private EmployeeService serveobj;
 
 @GetMapping
 public List<EmpModel>getAll()
 {
	 List<EmpModel>detail=serveobj.SelectAllEmployeeDetails();
	 
	return detail;
	 
 }
 @GetMapping("/viewdata/{employeeid}")
 public ResponseEntity<EmpModel>getEmployees(@PathVariable("employeeid")int employeeid)
 {
	 if(serveobj.getEmployeebyidservice(employeeid)!=null)
	 {
		 return new ResponseEntity<EmpModel>(serveobj.getEmployeebyidservice(employeeid),HttpStatus.OK);
	 }
	 else
	 {
		 return new ResponseEntity<EmpModel>(HttpStatus.NOT_FOUND);
		 
	 }
 }
 
 @GetMapping("delete/{employeeid}")
 public ResponseEntity <Void> deleteEmployee(@PathVariable("employeeid")int employeeid)
 {
	 if(serveobj.getEmployeebyidservice(employeeid)!=null)
	 {
		 
		 serveobj.deleteEmployeeservice(employeeid);
		 
		 return new ResponseEntity<Void>(HttpStatus.OK);
		 
	 }
	 else
	 {
		 return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		 
	 }
 }
 @PostMapping("/adding")
	public ResponseEntity<Void> addEmployee(@RequestBody EmpModel employee) {
		
			serveobj.addEmployeeservice(employee);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
 @PutMapping("update/{employeeid}")
	public ResponseEntity<Void> updateEmployee(@RequestBody EmpModel employee) {
	//if(serveobj.getEmployeebyidservice(employee.getEmailid())!=null) 
		if(serveobj.getEmployeebyidservice(employee.getEmployeeId())!=null) 
		{
			serveobj.UpdateEmployeeservice(employee);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else {
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
 }
 

 