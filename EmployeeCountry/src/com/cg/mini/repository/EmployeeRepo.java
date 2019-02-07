package com.cg.mini.repository;
import java.util.List;
import java.util.HashMap;
import com.cg.mini.bean.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cg.mini.bean.*;

public class EmployeeRepo implements IEmployeeRepo
{
	Employee emp=new Employee();
    Map <Integer,Employee> hm=new HashMap();
    List<Employee> list=new ArrayList<>();
	@Override
	public boolean save(Employee employee) 
	{
		// TODO Auto-generated method stub
	 
	
		if(hm.containsKey(employee.getId()))
		{
	     return false;
		}
		else
		{
            hm.put(emp.getId(),emp);
            return true;
		}

	}

	@Override
	public List<Employee> findById(int id)
	{
		// TODO Auto-generated method stub
	if( hm.containsKey(emp.getId()))
	{
		return list.add(emp);
		
	}
	else
	{
		System.out.println("Element  missing");
	}
		
	}

	
}
