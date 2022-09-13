package com.msd.collection;

import java.util.HashMap;

public class HashSet {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Amol", 11);
		map.put("Shree", 12);
		map.put("Rahul", 13);
		map.put("Msd", 14);
		map.put(null, 11);
		map.put("abc", null);
		
		System.out.println(map);
		
		

	}

}
