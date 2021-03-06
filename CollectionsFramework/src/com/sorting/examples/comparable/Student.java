package com.sorting.examples.comparable;

public class Student implements Comparable<Student> {
	
	private String name;
	int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Student that) {
	
		return Integer.compare(this.id, that.id);
	}
	
	


}
