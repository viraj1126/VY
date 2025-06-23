package com.serviceimpl;

import java.util.List;
import java.util.Optional;

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

	@Override
    public Student updateData(Student s, int id) {
        Optional<Student> optional = sr.findById(id);

        if (optional.isPresent()) {
            Student existing = optional.get();

            
            existing.setName(s.getName());
            existing.setAddress(s.getAddress());
            
            return sr.save(existing);
        } else {
            return null; 
        }
    }

}
