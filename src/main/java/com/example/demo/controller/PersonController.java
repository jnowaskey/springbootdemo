package com.example.demo.controller;

import java.util.Hashtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.PersonService;
import com.example.demo.model.Person;

@RestController
@RequestMapping("/persons")
public class PersonController 
{
	@Autowired
	PersonService ps;
	
	@RequestMapping("/all")
	public Hashtable<String, Person> getAll()
	{
		return ps.getAll();
	}

	@RequestMapping("{id}")
	public Person getPerson(@PathVariable("id")String id)
	{
		return ps.getPerson(id);
	}
}
