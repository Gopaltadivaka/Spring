package com.example.demo;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@RestController
public class FirstSpringApplication {
	@GetMapping(path="/getemployee/{id}/id/{firstname}/firstname/{lastname}/lastname",consumes="application/json", produces="apllication/json")
	public String getEmployee(@PathVariable(value="id")String id,@PathVariable(value="firstname")String firstname,
			@PathVariable(value="lastname")String lastname,
	@RequestHeader(value="email")String email) throws JsonProcessingException{
		System.out.println("id is here:"+id);
		System.out.println("firstname is here:"+firstname);
		System.out.println("lastname is here:"+lastname);
		System.out.println("email is here:"+email);
		HashMap employee= new HashMap<>();
		employee.put("firstname","John");
		employee.put("lastname","paul");
		employee.put("DOB","09-24-1998");
		ObjectMapper objectMapper=new ObjectMapper();
		return objectMapper.writeValueAsString(employee);
	}
		@PostMapping(path="/createemployee",consumes="application/json", produces="apllication/json")
		public String createEmployee(@RequestBody Object payload) throws JsonProcessingException{
			System.out.println("payload is here:"+payload);
			HashMap employee= new HashMap<>();
			employee.put("firstname","John");
			employee.put("lastname","paul");
			employee.put("DOB","09-24-1998");
			ObjectMapper objectMapper=new ObjectMapper();
			return objectMapper.writeValueAsString(employee);
	
	}
}

