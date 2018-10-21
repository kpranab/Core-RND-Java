package com.rnd.bestpractice;

import java.util.Date;

public class ImmutableTest {

	public static void main(String[] args) {
		ImmutableClass im = ImmutableClass.createImmutableInstance(100, "Test", new Date());
		System.out.println(im);
		tryToModify(im.getImmutableFiled1(), im.getImmutableField2(), im.getMutableField());
		System.out.println(im);
		
	}
	private static void tryToModify(Integer immutableField1,String immutableField2,Date mutableFiled){
		immutableField1 = 1000;
		immutableField2 = "Modified Test";
		mutableFiled.setDate(10);
	}
}
