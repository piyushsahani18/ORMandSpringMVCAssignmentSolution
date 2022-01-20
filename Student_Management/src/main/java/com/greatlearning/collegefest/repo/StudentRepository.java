package com.greatlearning.collegefest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.collegefest.entities.Students;

public interface StudentRepository extends JpaRepository <Students, Integer> {

}
