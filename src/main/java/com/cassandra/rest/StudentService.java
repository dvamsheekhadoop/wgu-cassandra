package com.cassandra.rest;

import java.util.List;

public interface StudentService {

	/**
	 * Used to Create the Employee Information
	 * 
	 * @param studentinfo
	 * @return {@link StudentInfo}
	 */
	public StudentInfo createStudentInfo(StudentInfo studentinfo);

	/**
	 * Getting the Employee Information using Id
	 * 
	 * @param id
	 * @return {@link StudentInfo}
	 */
	public StudentInfo getStudentInfo(int pidm);

	/**
	 * Used to Update the Employee Information
	 * 
	 * @param employee
	 * @return {@link StudentInfo}
	 */

	public StudentInfo updateStudentInfo(StudentInfo employee);

	/**
	 * Deleting the Employee Information using Id
	 * 
	 * @param id
	 */
	public void deleteStudentInfo(int id);

	/**
	 * Getting the All Employees information
	 * 
	 * @return
	 */
	public List<StudentInfo> getAllStudentInfo();
}
