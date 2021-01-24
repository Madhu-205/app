package com.madhu.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.madhu.entity.Employee;

public class Test {

	public static void main(String[] args)throws Exception {
	   SessionFactory sessionFactory=null;
	   Session session=null;
	   Transaction transaction=null;
			Configuration cfg= new Configuration();
			cfg.configure("/com/madhu/resources/hibernate.cfg.xml");
			sessionFactory=cfg.buildSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			Employee emp = new Employee();
			emp.setEno(111);
			emp.setEname("AAA");
			emp.setEsal(5000);
			emp.setEaddr("Hyd");
			session.save(emp);
			transaction.commit();
			System.out.println("Employee Inserted Successfully");
			session.close();
			sessionFactory.close();
	

	}

}
