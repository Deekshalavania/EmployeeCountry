package com.cg.mini.repository;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import com.cg.mini.bean.Employee;


public interface IEmployeeRepo {

	boolean save(Employee employee);
     List<Employee> findById(int id);
}
