package com.benguo.Filter;

import java.util.List;

/**
 * 一样参与
 * @author hubeiping
 *
 */
public class OrCriteria implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	
	

	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}




	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> criteria2 = criteria.meetCriteria(persons);
		List<Person> meetCriteria = otherCriteria.meetCriteria(persons);
		
		for (Person person : meetCriteria) {
			if(!criteria2.contains(person)){
				criteria2.add(person);
			}
		}
		
		// TODO Auto-generated method stub
		return criteria2;
	}

}
