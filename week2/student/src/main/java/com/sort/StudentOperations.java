package com.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Vishal
 */
public class StudentOperations {

	/**
	 * To store the student objects.
	 */
	private List<Student> students;

	/**
	 * To store student objects in key value pairs.
	 */
	private HashMap<Student, String> hashMap;

	/**
	 * To store students objects in a list.
	 */
	private List<Student> keys;

	/**
	 * To store value parameters in alist.
	 */
	private List<String> values;
	/**
	 * @param students - arraylist containing student objects
	 */
	public StudentOperations(final List<Student> students) {
		this.students = students;
	}

	/**
	 *  Displays the object consisting key in the passed attribute.
	 * @param key - value to be searched
	 * @param sortby - attribute to be searched
	 */
	public void search(String key, SortBy sortby) {
		int found=0;
		hashMap = new HashMap<Student, String>();
		addIntoMap(hashMap, sortby);
		if (hashMap.containsValue(key)) {
			for (Map.Entry<Student, String> entry : hashMap.entrySet()) {
				if (entry.getValue().equalsIgnoreCase(key)) {
					found=1;
					System.out.println(entry.getKey());
				}
			}
		}
		if (found == 0) {
			System.out.println("No Results found");
		}
	}
	/**
	 * Sorts students ArrayList based on the sortby parameter.
	 * Converts students Arraylist into Hashmap containing
	 * Student object as Key and sortby parameter as value.
	 * Sorting is performed on Hashmap based on value.
	 * @param sortby - based on which sorting is performed
	 */
	public void sort(final SortBy sortby) {
		hashMap = new HashMap<Student, String>();
		addIntoMap(hashMap, sortby);
		Iterator<String> valitr = values.iterator();
		String typeValue = valitr.next();
		if (isInteger(typeValue)) {
			String[] objArray = values.toArray(new String[0]);
			int[] intArray = new int[objArray.length];
			for (int index = 0; index < objArray.length; index++) {
				intArray[index] = Integer.parseInt(objArray[index]);
			}
			Arrays.sort(intArray);
			values.clear();
			for(int index = 0; index < objArray.length; index++) {
				values.add(Integer.toString(intArray[index]));
			}
		} else {
			Collections.sort(values);
		}
		LinkedHashMap<Student, String> linkedHashMap =
				new LinkedHashMap<Student, String>();
		Iterator<String> valueIterator = values.iterator();
		while (valueIterator.hasNext()) {
			String valueCheck = valueIterator.next();
			Iterator<Student> keyIterator = keys.iterator();
			while (keyIterator.hasNext()) {
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
	 * @param hashMap - objects to be added into
	 * @param sortby - value attribute
	 */
	private void addIntoMap(final HashMap<Student, String> hashMap,
			final SortBy sortby) {
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
		keys = new ArrayList<Student>(hashMap.keySet());
		values = new ArrayList<String>(hashMap.values());
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

	/**
	 * @param check - String to check whether integer or not
	 * @return true if integer.
	 */
	public static boolean isInteger(final String check) {
	    try {
	        Integer.parseInt(check);
	    } catch (NumberFormatException e) {
	        return false;
	    } catch (NullPointerException e) {
	        return false;
	    }
	    return true;
	}
}
