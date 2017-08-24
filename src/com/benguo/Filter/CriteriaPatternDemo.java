package com.benguo.Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
	
	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("小龙","male","Married"));
		list.add(new Person("小飞","female","Married"));
		list.add(new Person("梦梦","female","single"));
		list.add(new Person("王嘛呢","male","Married"));
		list.add(new Person("张大少","male","single"));
		list.add(new Person("户名","female","Married"));
		list.add(new Person("有没","male","single"));
		
		Criteria criteriaMale = new CriteriaMale();
		Criteria criteriaFemale = new CriteriaFemale();
		Criteria criteriaSingle = new CriteriaSingle();
		Criteria andCriteria = new AndCriteria(criteriaSingle, criteriaMale);
		Criteria orCriteria = new OrCriteria(criteriaSingle, criteriaFemale);
		
		
		System.out.println("criteriaMale:");
		toStringPerson(criteriaMale.meetCriteria(list));
		System.out.println("criteriaFemale:");
		toStringPerson(criteriaFemale.meetCriteria(list));
		System.out.println("criteriaSingle:");
		toStringPerson(criteriaSingle.meetCriteria(list));
		System.out.println("andCriteria:");
		toStringPerson(andCriteria.meetCriteria(list));
		System.out.println("orCriteria:");
		toStringPerson(orCriteria.meetCriteria(list));
		
		
		
		
	}
	
	
	public static void toStringPerson(List<Person> list) {
		
		for (Person person : list) {
			
			System.out.println("Person [name=" + person.getName() + ", gender=" + person.getGender()
					+ ", maritalStatus=" + person.getMaritalStatus() + "]");
		}
		
	}


}
