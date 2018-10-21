package com.rnd.string;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class StringOperation {
	
	public static void main(String[] args)  {
		
		StringOperation so = new StringOperation();
		int five = 5;//new Integer(5);
		String s1 = "test5";
		String s2 = "test"+5;
		String s3 = new String("test");
		s3 = s3+"5";
		System.out.println(s1.hashCode()+"  "+s2.hashCode()+" "+s3.hashCode());
		System.out.println(s2.hashCode() == s3.hashCode());
		System.out.println(s2==s1);
		
		
		
	}

}





