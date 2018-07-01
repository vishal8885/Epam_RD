package com.sort;

/**
 *
 * @author Vishal
 *
 */
public class Student{

	/**
	 * Student Id.
	 */
	private int studentId;

	/**
	 *  Student First Name.
	 */
	private String firstName;

	/**
	 * Student Last Name.
	 */
	private String lastName;

	/**
	 * Student year of study.
	 */
	private int yearOfStudy;

	/**
	 * Department.
	 */
	private String department;

	/**
	 * @param studentId - student Id
	 */
	public void setStudentId(final int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @param firstName - students first name
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName - students last name
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param yearOfStudy - students year of study
	 */
	public void setYearOfStudy(final int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	/**
	 * @param department - students department
	 */
	public void setDepartment(final String department) {
		this.department = department;
	}

	/**
	 * 	@return student id
	 */
	public String getStudentId() {
		return Integer.toString(studentId);
	}

	/**
	 *  @return students first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return students last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return students year of study
	 */
	public String getYearOfStudy() {
		return Integer.toString(yearOfStudy);
	}

	/**
	 * @return department name
	 */
	public String getDepartment() {
		return department;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName="
				+ firstName + ", lastName=" + lastName
				+ ", yearOfStudy=" + yearOfStudy
				+ ", department=" + department + "]";
	}

}
