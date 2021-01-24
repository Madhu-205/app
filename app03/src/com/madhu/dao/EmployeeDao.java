package com.madhu.dao;

import com.madhu.bean.Employee;

public interface EmployeeDao {
   public String insertEmployee(Employee emp);
   public Employee findnEmployee(int eno);
   public String updateEmployee(Employee emp);
   public String removeEmployee(int eno);
}
