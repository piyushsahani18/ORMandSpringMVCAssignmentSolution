package com.greatlearning.collegefest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.collegefest.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {
	public User getUserByUsername(String username);
}
