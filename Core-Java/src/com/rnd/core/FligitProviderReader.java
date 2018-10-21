package com.rnd.core;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FligitProviderReader {
	
	 public static void main (String[] args) {
		 ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		 File file = new File(classLoader.getResource("provider.txt").getFile());
	        ArrayList<String> inputData = new ArrayList<String>();
	        try (Scanner scanner = new Scanner(file)){
	            while(scanner.hasNextLine())
	                inputData.add(scanner.nextLine());
	            System.out.println(inputData);
	        } catch (IOException e) {
	        	e.printStackTrace();
	        }
	    }

}
