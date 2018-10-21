package com.rnd.test;
/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class LinesProcInt {
    public static int processData(ArrayList<String> array) {
        /* 
         * Modify this method to process `array` as indicated
         * in the question. At the end, return the appropriate value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
    	 Map<Integer,Integer> retVal = new HashMap<>();
         for (String string : array) {
         	String[] arrayElement = string.split(",");
         	int studentId = Integer.parseInt(arrayElement[0]);
         	int mark = Integer.parseInt(arrayElement[2].trim());
         	if(retVal.containsKey(studentId)){
         		retVal.put(studentId, retVal.get(studentId)+mark);
         	}else{
         		retVal.put(studentId, mark);
         	}
 		}
         int noOfStudentCount = 0;
         for (Entry<Integer, Integer> entrySet : retVal.entrySet()) {
			if(entrySet.getValue()>=100)
				noOfStudentCount++;
		}
        return noOfStudentCount;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine()) {
                String line = in.nextLine().trim();
                if (!line.isEmpty()) // Ignore blank lines
                    inputData.add(line);
            }
            int retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println("" + retVal);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
