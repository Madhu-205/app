package com.madhu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.madhu.bean.Employee;
import com.madhu.dao.EmployeeDao;

public class Test {

	public static void main(String[] args)throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		EmployeeDao empDao =(EmployeeDao) context.getBean("empDao");
		Employee emp = new Employee();
		emp.setEno(222);
		emp.setEname("BBB");
		emp.setEsal(5000);
		emp.setEaddr("hyd");
		String status=empDao.insertEmployee(emp);
		System.out.println(status);

	}

}
