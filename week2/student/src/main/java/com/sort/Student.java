package com.sort;

/**
 *
 * @author Vishal
 *
 */
public class Student {

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
	 *
	 * @param studentId - student Id
	 * @param firstName - students first name
	 * @param lastName - students last name
	 * @param yearOfStudy - students year of study
	 * @param department - students department
	 */
	public Student(final int studentId,  final String firstName,
			final String lastName, final int yearOfStudy,
			final String department) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfStudy = yearOfStudy;
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
