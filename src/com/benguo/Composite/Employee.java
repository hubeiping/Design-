package com.benguo.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计模式
 * 组合模式   ------   员工
 * @author hubeiping
 *
 */
public class Employee {
	
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}
	
	public void add(Employee e) {
		// TODO Auto-generated method stub
		subordinates.add(e);
	}
	
	
	public void remove(Employee e) {
		// TODO Auto-generated method stub
		subordinates.remove(e);
	}
	
	
	public List<Employee> getSubordinates() {
		
		return subordinates;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary="
				+ salary + "]";
	}
	
	

}
