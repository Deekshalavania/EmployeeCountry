package com.cg.mini.service;


import java.util.List;
import java.util.Map;
import com.cg.mini.bean.Address;
import com.cg.mini.bean.Employee;

public interface IEmployeeService 
{

	public Employee addEmployee(int id,String name, Address address);
     List<Employee> searchById(int id);
}
