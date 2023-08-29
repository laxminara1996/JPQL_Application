package com.ait.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.ait.constants.AppConstants;
import com.ait.dao.EmployeeDao;
import com.ait.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("DBA_CONNECTION");
	public Employee fetchEmpolyeeById(String empno) {
		 EntityManager em = factory.createEntityManager();
		TypedQuery<Employee> tq = em.createQuery(AppConstants.QUERY1,Employee.class);
		tq.setParameter(1, empno);
		Employee e = tq.getSingleResult();
		em.close();
		// TODO Auto-generated method stub
		return e;
	}

	public List<Employee> fetchEmployee() {
		 EntityManager em = factory.createEntityManager();
			TypedQuery<Employee> tq = em.createQuery(AppConstants.QUERY2,Employee.class);
			List<Employee> emps = tq.getResultList();
			em.close();
		// TODO Auto-generated method stub
		return emps;
	}

	public List<Object[]> fetchNamesandSalaries() {
		// TODO Auto-generated method stub
		EntityManager em = factory.createEntityManager();
		TypedQuery<Object[]> tq = em.createQuery(AppConstants.QUERY3,Object[].class);
		List<Object[]> lst = tq.getResultList();
		em.close();
		return lst;
	}

	

}
