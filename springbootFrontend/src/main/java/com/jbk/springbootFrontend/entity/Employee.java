package com.jbk.springbootFrontend.entity;

public class Employee {
	
private int employeeid;
private String employeename;
private String status;
private String createddtm;
private String updateddtm;
private String phoneno;
private String country;
public Employee() {
	super();
}
public Employee(int employeeid, String employeename, String status, String createddtm, String updateddtm,
		String phoneno, String country) {
	super();
	this.employeeid = employeeid;
	this.employeename = employeename;
	this.status = status;
	this.createddtm = createddtm;
	this.updateddtm = updateddtm;
	this.phoneno = phoneno;
	this.country = country;
}
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getCreateddtm() {
	return createddtm;
}
public void setCreateddtm(String createddtm) {
	this.createddtm = createddtm;
}
public String getUpdateddtm() {
	return updateddtm;
}
public void setUpdateddtm(String updateddtm) {
	this.updateddtm = updateddtm;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", status=" + status
			+ ", createddtm=" + createddtm + ", updateddtm=" + updateddtm + ", phoneno=" + phoneno + ", country="
			+ country + "]";
}





}
