package com.cg.mini.ui;
import java.util.Map;

import com.cg.mini.bean.Address;
import com.cg.mini.bean.City;
import com.cg.mini.bean.Country;
import com.cg.mini.bean.Employee;
import com.cg.mini.service.*;
public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EmployeeService serv=new EmployeeService();
		serv.addEmployee(1,"Deeksha",new Address("1-a",new Country("India",new City("Pune"))));
		serv.addEmployee(2,"Neha",new Address("2-b",new Country("India",new City("Delhi"))));
		serv.addEmployee(3,"Taneesha",new Address("3-b",new Country("India",new City("Agra"))));
		serv.addEmployee(4,"Shivi",new Address("4-c",new Country("India",new City("Mathura"))));
		
       System.out.println(serv.searchById(3));
	   

	}

}
