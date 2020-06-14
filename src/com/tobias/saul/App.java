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
		
		System.out.println("Students");
		students.forEach((id, name) -> {;
			System.out.println("ID: " + id + " Student: " + name);
		});
		System.out.println();
		
		
		
	}

}
