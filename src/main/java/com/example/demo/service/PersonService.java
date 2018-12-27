package com.example.demo.service;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import com.example.demo.model.Person;

@Service
public class PersonService {
	
	Hashtable<String, Person> persons = new Hashtable<String, Person>();
	
	public PersonService()
	{
		Person p = new Person();
		p.setId("1");
		p.setFirstName("Jay");
		p.setLastName("Nowaskey");
		p.setAge(54);
		persons.put("1", p);
		
		p = new Person();
		p.setId("2");
		p.setFirstName("Teresa");
		p.setLastName("Nowaskey");
		p.setAge(57);
		persons.put("2", p);
	}
	
	public Person getPerson(String id)
	{
		if (persons.containsKey(id))
			return persons.get(id);
		else
			return null;
	}
	
	public Hashtable<String, Person> getAll()
	{
		return persons;
	}
	
	

}
