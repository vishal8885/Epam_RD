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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Student> students = new ArrayList<Student>();
		while (fileScanner.hasNextLine()) {
			String fileLine = fileScanner.nextLine();

			String[] fileWords = fileLine.split(",");
			Student addObj = new Student(Integer.parseInt(fileWords[0]),
					fileWords[1],	fileWords[2],
					Integer.parseInt(fileWords[3]), fileWords[4]);
					students.add(addObj);
		}
		StudentOperations studentOperations =
				new StudentOperations(students);
		System.out.println("Sort By id:");
		studentOperations.sort(SortBy.BY_ID);
		studentOperations.display();
		System.out.println("Sort By firstname:");
		studentOperations.sort(SortBy.BY_FIRST_NAME);
		studentOperations.display();
		System.out.println("Sort By lastname:");
		studentOperations.sort(SortBy.BY_LAST_NAME);
		studentOperations.display();
		System.out.println("Sort By year:");
		studentOperations.sort(SortBy.BY_STUDY_YEAR);
		studentOperations.display();
		System.out.println("Sort By department:");
		studentOperations.sort(SortBy.BY_DEPARTMENT);
		studentOperations.display();
	}

}
