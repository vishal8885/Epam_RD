package com.sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Vishal
 */
public class App {

	/**
	 * @param args - command line arguments
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		File input = new File("src/main/resources/input.txt");
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		List<Student> students = new ArrayList<Student>();
		while (fileScanner.hasNextLine()) {
			String fileLine = fileScanner.nextLine();

			String[] fileWords = fileLine.split(",");
			Student addObj = new Student();
			addObj.setStudentId(Integer.parseInt(fileWords[0]));
			addObj.setFirstName(fileWords[1]);
			addObj.setLastName(fileWords[2]);
			addObj.setYearOfStudy(Integer.parseInt(fileWords[3]));
			addObj.setDepartment(fileWords[4]);
			students.add(addObj);
		}
		StudentOperations studentOperations =
				new StudentOperations(students);
		Scanner userin = new Scanner(System.in);
		do {
			System.out.println("1. Sort \t2. Search");
			System.out.print("Enter your choice : ");
			int ch = userin.nextInt();
			int opt = 0;
			if (ch == 1)  {
				System.out.println("SortBy:\n1.Id\n2.firstname"
						+ "\n3.lastname\n4.year\n5.department");
				System.out.print("Enter sort option : ");
				opt = userin.nextInt();
				switch (opt) {
				case 1:
					studentOperations.sort(SortBy.BY_ID);
					break;
				case 2 :
					studentOperations.sort(SortBy.BY_FIRST_NAME);
					break;
				case 3:
					studentOperations.sort(SortBy.BY_LAST_NAME);
					break;
				case 4:
					studentOperations.sort(SortBy.BY_STUDY_YEAR);
					break;
				case 5:
					studentOperations.sort(SortBy.BY_DEPARTMENT);
					break;
				default :
					System.out.println("Invalid Option");
				}
				studentOperations.display();
			} else if(ch == 2) {
				System.out.println("Enter Serach key : ");
				String key = userin.next();
				System.out.println("SearchBy:\n1.Id\n2.firstname"
						+ "\n3.lastname\n4.year\n5.department");
				System.out.print("Enter sort option : ");
				opt = userin.nextInt();
				switch (opt) {
				case 1:
					studentOperations.search(key, SortBy.BY_ID);
					break;
				case 2 :
					studentOperations.search(key, SortBy.BY_FIRST_NAME);
					break;
				case 3:
					studentOperations.search(key, SortBy.BY_LAST_NAME);
					break;
				case 4:
					studentOperations.search(key, SortBy.BY_STUDY_YEAR);
					break;
				case 5:
					studentOperations.search(key, SortBy.BY_DEPARTMENT);
					break;
				default :
					System.out.println("Invalid Option");
					break;
				}
			} else {
				System.out.println("Invalid Choice");
				break;
			}
		} while (true);
		userin.close();
	}
}
