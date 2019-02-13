package com.sorting.examples.comparable;

import java.util.ArrayList;
import java.util.*;

/**
 * 
 * This class Contains example comparable 
 *
 */
public class SortingComparable {

	public static void main(String[] args) {
		List<Student> st =new ArrayList<>();
		st.add(new Student("Student5",5));
		st.add(new Student("Student1",1  ));
		st.add(new Student("Student2",2));
		Collections.sort(st);
		
		List<String> list=new ArrayList<String>();
		list.add("test4");
		list.add("test2");
		list.add("test3");
		
		Collections.sort(list);
		
		for (String stdnt : list) {
			System.out.println(stdnt);
		}
		System.out.println(list);
		
		System.out.println(st);
		
		for(Student stu:st)
		{
			System.out.println(st);
		}
		
	}
	
	
		
	
}

