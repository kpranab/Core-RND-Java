package com.rnd.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Muna
 *
 */
public class ForEachDemo {

	
	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Pranab");
		nameList.add("Saroj");
		nameList.add("Brahma");
		nameList.add("Debabrata");
		
		//Iterate list using Java8 
		nameList.forEach(name -> System.out.println(name));
		
		Map<Integer,String> nameMap = new HashMap<>();
		nameMap.put(1, "Pranab");
		nameMap.put(2, "Saroj");
		nameMap.put(3, "Brahma");
		nameMap.put(4, "Debabrata");
		
		//Iterate map using java8
		System.out.println();
		nameMap.forEach((key,value) -> System.out.println("Id : "+key+"  Name : "+value));
	}
}
