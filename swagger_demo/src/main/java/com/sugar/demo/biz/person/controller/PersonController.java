package com.sugar.demo.biz.person.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sugar.demo.biz.person.entity.Person;

@RestController
public class PersonController {

	@RequestMapping(path = "/person",method = RequestMethod.POST)
	public Person person(@Valid @RequestBody Person person) {
		return person;
	}
	
	@RequestMapping(path = "/personByLastName", method = RequestMethod.GET)
	public Collection<Person> findByLastName(@NotNull
	        @NotBlank
	        @Size(max = 10)String lastName){
	        List<Person> hardCoded= new ArrayList<>();
	        Person person= new Person();
	        person.setAge(20);
	        person.setCreditCardNumber("4111111111111111");
	        person.setEmail("abc@abc.com");
	        person.setEmail2("abc1@abc.com");
	        person.setFirstName("Somefirstname");
	        person.setLastName(lastName);
	        person.setId(1);
	        hardCoded.add(person);
	        return hardCoded;

	    }
}
