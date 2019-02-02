package com.lausn.grid.cdi.grid.page;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import com.lausn.grid.cdi.dto.PersonBean;
import com.vaadin.cdi.annotation.UIScoped;

@ApplicationScoped
public class PersonService {

	private List<PersonBean> persons=new ArrayList<>();
	

	@PostConstruct
	public void init(){
		for(int i=0;i<1000;i++){
    		PersonBean person=new PersonBean();
    		person.setId(i+1);
    		person.setName("Person "+person.getId());
    		persons.add(person);
    	}
		
	}
	
	public List<PersonBean> findPerson(int offset,int limit){
		// creating sample data
    	return persons.subList(offset, offset+limit);
	}
	
	public int count(){
		return persons.size();
	}
}
