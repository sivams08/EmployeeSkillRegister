package com.niit.DaoSample.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="EmpModel")
public class EmpModel {
@Id
private int EmployeeId;

private String EmployeeName;

private String DateOfBirth;
public int getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}
public String getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	DateOfBirth = dateOfBirth;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getEmailid() {
	return Emailid;
}
public void setEmailid(String emailid) {
	Emailid = emailid;
}
public String getMobileNo() {
	return MobileNo;
}
public void setMobileNo(String mobileNo) {
	MobileNo = mobileNo;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getQualification() {
	return Qualification;
}
public void setQualification(String qualification) {
	Qualification = qualification;
}
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}

private String Gender;

private String Emailid;

private String MobileNo;

private String Password;

private String Qualification;

private String Role;
}
