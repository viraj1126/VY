package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.Servicei;

@RestController
public class HomeController {

	@Autowired
	Servicei si;
	
	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable int id)
	{
		
		delete(id);
	}
}
