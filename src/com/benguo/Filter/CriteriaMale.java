package com.benguo.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * ¹ıÂËÄĞ
 * @author hubeiping
 *
 */
public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePerson = new ArrayList<Person>();
		
		for (Person person : persons) {
			
			if("male".equalsIgnoreCase(person.getGender())){
				
				malePerson.add(person);
			}
			
		}
		// TODO Auto-generated method stub
		return malePerson;
	}

}
