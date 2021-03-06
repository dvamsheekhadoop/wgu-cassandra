package com.cassandra.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfoController {

	@Autowired
	private EmployeeService employeeService;

	public StudentInfoController() {
		System.out.println("EmployeeController()");
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	StudentInfo create(@RequestBody StudentInfo studentinfo) {
		return employeeService.createEmployee(studentinfo);
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
	void delete(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	List<Studinfo> findAll() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	Studinfo findById(@PathVariable("id") int id) {
		return employeeService.getEmployee(id);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.PUT)
	Studinfo update(@RequestBody Studinfo employee) {
		return employeeService.updateEmployee(employee);
	}
}
