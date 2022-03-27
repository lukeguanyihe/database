package com.in28minutes.database.databasedemo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {
	// Connect to the database
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}
	

}
