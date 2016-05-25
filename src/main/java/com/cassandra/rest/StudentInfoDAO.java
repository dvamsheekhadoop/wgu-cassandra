package com.cassandra.rest;

import java.util.List;

public interface StudentInfoDAO {
	/**
	 * Used to Create the Employee Information
	 * 
	 * @param employee
	 * @return {@link Studinfo}
	 */
	public Studinfo createEmployee(Studinfo studinfo);

	/**
	 * Getting the Employee Information using Id
	 * 
	 * @param id
	 * @return {@link Studinfo}
	 */
	public Studinfo getEmployee(int id);

	/**
	 * Used to Update the Employee Information
	 * 
	 * @param employee
	 * @return {@link Studinfo}
	 */

	public Studinfo updateEmployee(Studinfo employee);

	/**
	 * Deleting the Employee Information using Id
	 * 
	 * @param id
	 */
	public void deleteEmployee(int id);

	/**
	 * Getting the All Employees information
	 * 
	 * @return
	 */
	public List<Studinfo> getAllEmployees();
}
