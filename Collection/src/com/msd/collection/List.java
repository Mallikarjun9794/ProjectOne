package com.msd.collection;

import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(null);
		list.add(77);
		list.add(55);
		list.add(null);
		list.add(44);
		list.add(77);
		list.add(null);
		
		
		System.out.println(list);

	}

}
