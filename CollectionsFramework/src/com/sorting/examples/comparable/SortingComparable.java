package com.sorting.examples.comparable;

import java.util.ArrayList;
import java.util.*;

/**
 * 
 * This class Contains example comparable
 *
 */
class SortingUsingComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.id, o2.id);
	}

}

public class SortingComparable {

	public static void main(String[] args) {
		List<Student> st = new ArrayList<>();
		st.add(new Student("Student5", 5));
		st.add(new Student("Student1", 1));
		st.add(new Student("Student2", 2));
		Collections.sort(st);

		List<String> list = new ArrayList<String>();
		list.add("test4");
		list.add("test2");
		list.add("test3");
		// sorted using comparable
		Collections.sort(list);
		// sorted Using Comparator
		Collections.sort(st, new SortingUsingComparator());
		for (String stdnt : list) {
			System.out.println(stdnt);
		}
		System.out.println(list);

		System.out.println(st);

		for (Student stu : st) {
			System.out.println(st);
		}

	}

}
