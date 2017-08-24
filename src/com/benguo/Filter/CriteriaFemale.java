package com.benguo.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * ¹ýÂËÅ®
 * @author hubeiping
 *
 */
public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> femalePerson = new ArrayList<Person>();
		
		for (Person person : persons) {
			
			if("female".equalsIgnoreCase(person.getGender())){
				
				femalePerson.add(person);
			}
			
		}
		// TODO Auto-generated method stub
		return femalePerson;
	}

}
