package com.cassandra.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private CassandraTemplate myCassandraTemplate;

	@Override
	public Studinfo createEmployee(Studinfo employee) {
		return myCassandraTemplate.create(employee);
	}

	@Override
	public Studinfo getEmployee(int id) {
		return myCassandraTemplate.findById(id, Studinfo.class);
	}

	@Override
	public Studinfo updateEmployee(Studinfo employee) {
		return myCassandraTemplate.update(employee, Studinfo.class);
	}

	@Override
	public void deleteEmployee(int id) {
		myCassandraTemplate.deleteById(id, Studinfo.class);
	}

	@Override
	public List<Studinfo> getAllEmployees() {
		return myCassandraTemplate.findAll(Studinfo.class);
	}
}