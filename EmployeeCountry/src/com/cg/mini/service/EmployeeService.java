package com.cg.mini.service;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import com.cg.mini.bean.Address;
import com.cg.mini.bean.Employee;
import com.cg.mini.repository.EmployeeRepo;
public class EmployeeService implements IEmployeeService
{
           List <Employee> list2=new ArrayList<>();
	
			Employee emp=new Employee();
			EmployeeRepo repository= new EmployeeRepo();
	@Override
	public Employee addEmployee(int id, String name, Address address)
	{
		repository.save(emp);
		return emp;
	}	
	@Override
	public List<Employee> searchById(int id) {
	
		list2=repository.findById(emp.getId());
		return  list2;
	}
	


}