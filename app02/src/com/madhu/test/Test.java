package com.madhu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.madhu.beans.Employee;
import com.madhu.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/madhu/resources/applicationContext.xml");
		EmployeeDao dao=(EmployeeDao)context.getBean("empDao");
		
		
		Employee emp = new Employee();
		emp.setEno(111);
		emp.setEname("AAA");
		emp.setEsal(5000);
		emp.setEaddr("hyd");
		
		String status=dao.insert(emp);
		System.out.println(status);

	}

}
