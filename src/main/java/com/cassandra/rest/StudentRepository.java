package com.cassandra.rest;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentInfo, String>{

	@Query("Select * from RDB.stuinfo where username=?0")
	public StudentInfo findByUsername(String username);
	
}
