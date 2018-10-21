package com.rnd.bestpractice;

import java.util.Date;

/**
 * @author Muna
 *
 */
public final class ImmutableClass {

	private final Integer immutableField1;
	private final String immutableField2;
	private final Date mutableField;

	public ImmutableClass(Integer immutableFiled1, String immutableFiles2, Date mutableField) {
		this.immutableField1 = immutableFiled1;
		this.immutableField2 = immutableFiles2;
		//this.mutableField = mutableField;
		this.mutableField = new Date(mutableField.getTime());
	}

	public Integer getImmutableFiled1() {
		return immutableField1;
	}

	public String getImmutableField2() {
		return immutableField2;
	}

	public Date getMutableField() {
		return new Date(mutableField.getTime());
		//return mutableField;
	}
	
	public static ImmutableClass createImmutableInstance(Integer field1,String filed2,Date filed3){
		return new ImmutableClass(field1, filed2, filed3);
		
	}
	@Override
	public String toString() {
		return immutableField1 +" - "+ immutableField2 +" - "+ mutableField;
	}

}
