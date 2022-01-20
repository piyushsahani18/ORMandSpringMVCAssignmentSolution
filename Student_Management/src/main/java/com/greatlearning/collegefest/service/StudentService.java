package com.greatlearning.collegefest.service;

import java.util.List;

import com.greatlearning.collegefest.entities.Students;

public interface StudentService {
	
    public List<Students> findAll();

	public void save(Students theStudent);

	public void deleteById(int theId);
	
	public Students findById(int id);


}
