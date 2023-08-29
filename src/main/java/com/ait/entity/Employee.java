package com.ait.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {
@Id
@Column(name="empno")
private String empNumber;
@Column(name="ename")
private String empName;
@Column(name="sal")
private Integer empSalary;
@Column(name="deptno")
private Integer deptNumber;
public String getEmpNumber() {
	return empNumber;
}
public void setEmpNumber(String empNumber) {
	this.empNumber = empNumber;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Integer getEmpSalary() {
	return empSalary;
}
@Override
public String toString() {
	return "Employee [empNumber=" + empNumber + ", empName=" + empName + ", empSalary=" + empSalary + ", deptNumber="
			+ deptNumber + "]";
}
public void setEmpSalary(Integer empSalary) {
	this.empSalary = empSalary;
}
public Integer getDeptNumber() {
	return deptNumber;
}
public void setDeptNumber(Integer deptNumber) {
	this.deptNumber = deptNumber;
}
}
