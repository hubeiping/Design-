package com.benguo.Composite;

import java.util.List;

public class CompositePatternDemo {
	
	public static void main(String[] args) {
		
		Employee ceo = new Employee("小龙","ceo",100000);
		
		Employee dongshi = new Employee("小王","董事",200000);
		
		Employee jingli = new Employee("真封神","经理",10000);
		
		Employee gongren = new Employee("阿道夫","工人",200);
		
		Employee duizhang = new Employee("格局","队长",2000);
		
		Employee xiaoshou = new Employee("李丹","销售",2000);
		
		Employee wenyuan = new Employee("混沌决","文员",2000);
		
		Employee buzhang = new Employee("呆呆的龙","部长",80000);
		
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
