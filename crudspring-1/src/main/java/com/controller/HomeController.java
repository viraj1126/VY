package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.Servicei;

@RestController
public class HomeController {

	@Autowired
	Servicei si;
	

	@GetMapping("/students")
	public List<Student> Students()
	{
		List<Student> list = si.getAllStudents();
		System.out.println(list);
		
		return list;
		
		
	}
	
	@PutMapping("/student/{id}")
	public Student updateData(@RequestBody Student s,@PathVariable int id) 
	{
		return si.updateData(s,id);
		
	}
	
	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable int id)
	{
		
		delete(id);
		
	}
	
}
