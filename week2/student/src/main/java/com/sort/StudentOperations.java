package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * 
 * @author Vishal
 *
 */
public class StudentOperations {

	/**
	 * To store the student objects.
	 */
	private List<Student> students;

	/**
	 * @param students - arraylist containing student objects
	 */
	public StudentOperations(List<Student> students) {
		this.students = students;
	}

	
	/**
	 * Sorts students ArrayList based on the sortby parameter.
	 * Converts students Arraylist into Hashmap containing
	 * Student object as Key and sortby parameter as value.
	 * Sorting is performed on Hashmap based on value.
	 * @param sortby - based on which sorting is performed
	 */
	public void sort(final SortBy sortby) {

		HashMap<Student, String> hashMap =
				new HashMap<Student, String>();
		Iterator<Student> studentItr = students.iterator();
		Student stu = null;

		while (studentItr.hasNext()) {
			stu = studentItr.next();
			if (sortby.toString().equals("BY_ID")) {
				hashMap.put(stu, stu.getStudentId());
			} else if (sortby.toString().equals("BY_FIRST_NAME")) {
				hashMap.put(stu, stu.getFirstName());
			} else if (sortby.toString().equals("BY_LAST_NAME")) {
				hashMap.put(stu, stu.getLastName());
			} else if (sortby.toString().equals("BY_STUDY_YEAR")) {
				hashMap.put(stu, stu.getYearOfStudy());
			} else if (sortby.toString().equals("BY_DEPARTMENT")) {
				hashMap.put(stu, stu.getDepartment());
			}
		}

		List<Student> keys = new ArrayList<Student>(hashMap.keySet());
		List<String> values = new ArrayList<String>(hashMap.values());
		Collections.sort(values);
		LinkedHashMap<Student, String> linkedHashMap =
				new LinkedHashMap<Student, String>();
		Iterator<String> valueIterator = values.iterator();

		while (valueIterator.hasNext()) {
			String valueCheck = valueIterator.next();
			Iterator<Student> keyIterator = keys.iterator();
			while(keyIterator.hasNext()) {
				Student key = keyIterator.next();
				String value = hashMap.get(key);
				if (value.equals(valueCheck)) {
					keyIterator.remove();
					linkedHashMap.put(key, value);
					break;
				}
			}
			
		}
    	this.students.clear();
		this.students.addAll(new ArrayList<Student>(linkedHashMap.keySet()));
	}

	/**
	 * Displaying students ArrayList.
	 */
	public void display() {
		Iterator<Student> studentItr = students.iterator();
		while (studentItr.hasNext()) {
			System.out.println(studentItr.next());
		}
	}
}
