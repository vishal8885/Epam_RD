package student;

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
	private int department;


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
			final int department) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfStudy = yearOfStudy;
		this.department = department;
	}

	/**
	 * 	@return student id
	 */
	public int getStudentId() {
		return studentId;
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
	public int getYearOfStudy() {
		return yearOfStudy;
	}

	/**
	 * @return department name
	 */
	public int getDepartment() {
		return department;
	}


}
