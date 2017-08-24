package com.benguo.Filter;

import java.util.List;

/**
 * 同时参与
 * @author hubeiping
 *
 */
public class AndCriteria implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}



	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> meetCriteria = criteria.meetCriteria(persons);
		// TODO Auto-generated method stub
		return otherCriteria.meetCriteria(meetCriteria);
		
	}
	
	

}
