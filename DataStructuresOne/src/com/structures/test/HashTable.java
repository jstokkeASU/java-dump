package com.structures.test;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {
	
	int size;
	String[] array;
	
	

	public static void main(String[] args) {
		String item = "Item";
		Hashtable hashTab = new Hashtable();
		HashMap hashem = new HashMap();
		for (int i=0; i < 100; i++) {
			String num = String.valueOf(i);
			hashTab.put(num, item+num);
			hashem.put(num, item+num);
		}
		for (int i=50; i < 150; i++) {
			String num = String.valueOf(i);
			hashTab.put(1+num, item+num);
			hashem.put(1+num, item+num);
		}
		hashem.put("King","100");
		hashem.put("Blake","10");
		System.out.println(hashTab);
		System.out.println(hashTab.size());
		System.out.println(hashem);
		System.out.println(hashem.size());
		System.out.println(hashem.get("88"));
		System.out.println(hashem.get("King"));
		int j =0;
		for ( Object key : hashem.keySet() ) {
			j++;
		    System.out.println( key + " - "+j);
		}
	}

}
