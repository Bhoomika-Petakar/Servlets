package com.dao;
import java.util.List;

import com.models.Employee;
public interface EmployeeBO {
	 int save(Employee e);
	 int update(Employee e);
	 
	 int delete(int id);
	 int delete(Employee e);
	 Employee get(int id);
	 List<Employee> getAll();
	 
		
	

}
