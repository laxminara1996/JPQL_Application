package com.ait.test;

import java.util.List;

import com.ait.dao.EmployeeDao;
import com.ait.dao.impl.EmployeeDaoImpl;
import com.ait.entity.Employee;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao dao = new EmployeeDaoImpl();
		//Employee e = dao.fetchEmpolyeeById("e1");
		List<Employee> listofemps = dao.fetchEmployee();
		for(Employee l : listofemps) {
			System.out.println(l);
		}
		
		List<Object[]> emps = dao.fetchNamesandSalaries();
		emps.forEach(obj-> {
			System.out.println(obj[0]+"---"+obj[1]);
		});
	}

}
