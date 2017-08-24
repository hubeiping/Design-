package com.benguo.Composite;

import java.util.List;

public class CompositePatternDemo {
	
	public static void main(String[] args) {
		
		Employee ceo = new Employee("С��","ceo",100000);
		
		Employee dongshi = new Employee("С��","����",200000);
		
		Employee jingli = new Employee("�����","����",10000);
		
		Employee gongren = new Employee("������","����",200);
		
		Employee duizhang = new Employee("���","�ӳ�",2000);
		
		Employee xiaoshou = new Employee("�","����",2000);
		
		Employee wenyuan = new Employee("�����","��Ա",2000);
		
		Employee buzhang = new Employee("��������","����",80000);
		
		dongshi.add(ceo);
		
		ceo.add(jingli);
		
		ceo.add(buzhang);
		
		jingli.add(wenyuan);
		
		jingli.add(xiaoshou);
		
		jingli.add(duizhang);
		
		duizhang.add(gongren);
		
		showList(dongshi.getSubordinates());
		
	}
	
	
	private static void showList(List<Employee> e) {
		// TODO Auto-generated method stub
		if(!e.isEmpty()){
			for (Employee employee : e) {
				System.out.println(employee);
				showList(employee.getSubordinates());
			}
		}

	}
	

}
