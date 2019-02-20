package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List<String> ls = new ArrayList<String>(10);
		ls.add("Puneeth");
		ls.add("Puneeth2");
		ls.add("Puneeth3");
		ls.add("Puneeth");
		ls.add("Puneeth2");
		ls.add("Puneeth3");
		ls.add("Puneeth");
		ls.add("Puneeth2");
		ls.add("Puneeth3");
		ls.add("Puneeth");
		ls.add("Puneeth2");
		ls.add("Puneeth310");

		for (String string : ls) {
			System.out.println(string);

		}

	}

}
