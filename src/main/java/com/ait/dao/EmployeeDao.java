package com.ait.dao;

import java.util.List;

import com.ait.entity.Employee;

public interface EmployeeDao {
Employee fetchEmpolyeeById(String empno);
List<Employee> fetchEmployee();
List<Object[]> fetchNamesandSalaries();
}
