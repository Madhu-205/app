package com.madhu.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.madhu.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    private HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
    @Transactional
	@Override
	public String insert(Employee emp) {
		String status="";
    	try {
			int eno=(Integer)hibernateTemplate.save(emp);
			if(eno==emp.getEno()) {
				status="Employee Inserted Successfully";
			}else {
				status="Employee Insertion Failure";
			}
		} catch (Exception e) {
			status="Employee Insertion Failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Employee search(int eno) {
		
		return null;
	}

	@Override
	public String update(Employee emp) {
		
		return null;
	}

	@Override
	public String delete(Employee emp) {
	
		return null;
	}

}
