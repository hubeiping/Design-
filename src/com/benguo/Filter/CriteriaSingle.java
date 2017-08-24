package com.benguo.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * µ¥
 * @author hubeiping
 *
 */
public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> singlePerson = new ArrayList<Person>();
		
		for (Person person : persons) {
			
			if("single".equalsIgnoreCase(person.getMaritalStatus())){
				
				singlePerson.add(person);
			}
			
		}
		// TODO Auto-generated method stub
		return singlePerson;
	}

}
