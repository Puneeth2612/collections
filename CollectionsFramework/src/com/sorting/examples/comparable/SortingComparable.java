package com.sorting.examples.comparable;

import java.util.ArrayList;
import java.util.*;

public class SortingComparable {

	public static void main(String[] args) {
		List<Student> st =new ArrayList<>();
		st.add(new Student("Puneeth2",5));
		st.add(new Student("Puneeth",1  ));
		st.add(new Student("Puneeth2",2));
		Collections.sort(st);
		
		List list=new ArrayList<String>();
		list.add("Puneeth");
		list.add("Jayanth");
		list.add("Dude");
		
		System.out.println(st);
		
		for(Student stu:st)
		{
			System.out.println(st);
		}
		
	}
	
	
		
	
}

