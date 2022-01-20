package com.greatlearning.collegefest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.collegefest.entities.Students;
import com.greatlearning.collegefest.repo.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpl implements StudentService  {
	
	@Autowired
	StudentRepository x;

	@Override
	public List<Students> findAll() {
		// TODO Auto-generated method stub
		List<Students> students = x.findAll();
		return students;
	}

	@Override
	public void save(Students theStudent) {
		// TODO Auto-generated method stub
		x.save(theStudent);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		x.deleteById(theId);
		
	}

	@Override
	public Students findById(int id) {
		// TODO Auto-generated method stub
		Students student = x.findById(id).get();
		return student;
	}

}
