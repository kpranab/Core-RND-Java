package com.rnd.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class RanjanTest {

	public static void main(String[] args) {

		List<String> inputList = Arrays.asList("DEL.DR1.R1", "DEL.DR1.R2", "DEL.DR2.R3", "MUM.MR1.R4", "MUM.MR1.R5");

		Map<String, HashMap<String, Set<String>>> resultMap = new HashMap<>();
		HashMap<String, Set<String>> drMap = new HashMap<>();
		HashMap<String, Set<String>> mrMap = new HashMap<>();

		for (String string : inputList) {
			List<String> asList = Arrays.asList(string.split("\\."));
			System.out.println(asList);
			for (int i = 0; i < asList.size(); i++) {
				if (asList.get(0).startsWith("DEL")) {
						createMap(drMap, asList);
				} else if (asList.get(0).startsWith("MUM")) {
						createMap(mrMap, asList);
				}
			}
			createResultMap(resultMap, drMap, mrMap, asList);
		}

		System.out.println();
		resultMap.forEach((k, v) -> System.out.println(k + " " + v));
	}

	private static void createResultMap(Map<String, HashMap<String, Set<String>>> resultMap,
			HashMap<String, Set<String>> drMap, HashMap<String, Set<String>> mrMap, List<String> asList) {
		if (asList.get(0).startsWith("DEL")) {
			resultMap.put(asList.get(0), drMap);
		}
		if (asList.get(0).startsWith("MUM")) {
			resultMap.put(asList.get(0), mrMap);
		}
	}

	private static void createMap(HashMap<String, Set<String>> inputMap, List<String> asList) {
		if (inputMap.containsKey(asList.get(1))) {
			Set<String> set = inputMap.get(asList.get(1));
			set.add(asList.get(2));
			inputMap.put(asList.get(1), set);
		} else {
			Set<String> tempSet = new HashSet<>();
			tempSet.add(asList.get(2));
			inputMap.put(asList.get(1), tempSet);
		}
	}

}

/*
[DEL, DR1, R1]
[DEL, DR1, R2]
[DEL, DR2, R3]
[MUM, MR1, R4]
[MUM, MR1, R5]

MUM {MR1=[R4, R5]}
DEL {DR1=[R2, R1], DR2=[R3]}
*/
