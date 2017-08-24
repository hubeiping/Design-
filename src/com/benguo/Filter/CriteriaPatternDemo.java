package com.benguo.Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
	
	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("С��","male","Married"));
		list.add(new Person("С��","female","Married"));
		list.add(new Person("����","female","single"));
		list.add(new Person("������","male","Married"));
		list.add(new Person("�Ŵ���","male","single"));
		list.add(new Person("����","female","Married"));
		list.add(new Person("��û","male","single"));
		
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
