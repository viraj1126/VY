package com.service;

 

import java.util.List;
 

import java.util.List;

import com.model.Student;

public interface Servicei 
{

 
public Student updateData(Student s, int id);
 

	
	public void delete(int id);
	 

	public List<Student> getAllStudents();
	
	
}
