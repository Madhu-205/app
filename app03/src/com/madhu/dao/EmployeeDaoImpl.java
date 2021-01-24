package com.madhu.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.madhu.bean.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	String status="";
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public String insertEmployee(Employee emp) {
         entityManager.persist(emp);
         status="Success";
		return status;
	}
	
@Transactional
	@Override
	public Employee findnEmployee(int eno) {
		Employee emp=(Employee)entityManager.find(Employee.class, eno);
		return emp;
	}

	@Override
	public String updateEmployee(Employee emp) {
		Employee employee=entityManager.find(Employee.class, emp.getEno() );
		employee.setEno(emp.getEno());
		employee.setEname(emp.getEname());
		employee.setEsal(emp.getEsal());
		employee.setEaddr(emp.getEaddr());
		status="success";
		return status;
	}

	@Override
	public String removeEmployee(int eno) {
	    Employee employee =entityManager.find(Employee.class, eno);
	    entityManager.remove(employee);
	    status="Success";
		return status;
	}

}
