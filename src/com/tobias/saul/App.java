package com.tobias.saul;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<Integer, String>();

		students.put(0, "hank hill");
		students.put(1, "peggy hill");
		students.put(2, "bobby hill");
		students.put(3, "dale griblle");
		students.put(4, "nancy griblle");

		System.out.println("Students....");
		print(students);
		System.out.println();

		System.out.println("Remove Student....");
		students.remove(0);
		print(students);
		System.out.println();
		
		System.out.println("Get a Student");
		System.out.println(students.get(2));
		System.out.println();
		
		System.out.println("Contains key 2: " + students.containsKey(2));
		System.out.println();
		
		System.out.println("Key Set....");
		students.keySet().forEach(key -> System.out.println(key));
		System.out.println();
		
		System.out.println("Values....");
		students.values().forEach(value -> System.out.println(value));
		System.out.println();
		
		System.out.println("Size: " + students.size());

	}

	public static void print(Map<Integer, String> students) {
		students.forEach((id, name) -> {
			System.out.println("ID: " + id + " Student: " + name);
		});
	}

}
