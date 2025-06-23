package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.Student;
import com.repository.StudentRepository;
import com.service.Servicei;

public class Serviceimpl implements Servicei{

	@Autowired
	StudentRepository sr;

	@Override
	public void delete(int id)
	{
		
		sr.deleteById(id);
		
	}


	@Override
	public List<Student> getAllStudents()
	{
		
		List<Student> list = (List<Student>) sr.findAll();
		return list;
	}


}
