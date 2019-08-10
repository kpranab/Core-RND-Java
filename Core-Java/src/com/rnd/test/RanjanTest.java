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
		for (String string : inputList) {
			List<String> asList = Arrays.asList(string.split("\\."));
			System.out.println(asList);
			for (int i = 0; i < asList.size(); i++) {
				getResultMap(resultMap, asList);
			}
		}

		System.out.println();
		resultMap.forEach((k, v) -> System.out.println(k + " " + v));
	}

	private static void getResultMap(Map<String, HashMap<String, Set<String>>> resultMap, List<String> asList) {
		if (resultMap.containsKey(asList.get(0))) {
			HashMap<String, Set<String>> hashMap = resultMap.get(asList.get(0));
			resultMap.put(asList.get(0), createMap(hashMap, asList));
		} else {
			resultMap.put(asList.get(0), createMap(asList));
		}
	}

	private static HashMap<String, Set<String>> createMap(HashMap<String, Set<String>> inputMap, List<String> asList) {
		if (inputMap.containsKey(asList.get(1))) {
			Set<String> set = inputMap.get(asList.get(1));
			set.add(asList.get(2));
			inputMap.put(asList.get(1), set);
		} else {
			Set<String> tempSet = new HashSet<>();
			tempSet.add(asList.get(2));
			inputMap.put(asList.get(1), tempSet);
		}
		return inputMap;
	}

	private static HashMap<String, Set<String>> createMap(List<String> asList) {
		HashMap<String, Set<String>> inputMap = new HashMap<>();
		if (inputMap.containsKey(asList.get(1))) {
			Set<String> set = inputMap.get(asList.get(1));
			set.add(asList.get(2));
			inputMap.put(asList.get(1), set);
		} else {
			Set<String> tempSet = new HashSet<>();
			tempSet.add(asList.get(2));
			inputMap.put(asList.get(1), tempSet);
		}
		return inputMap;
	}

}

/*[DEL, DR1, R1]
[DEL, DR1, R2]
[DEL, DR2, R3]
[MUM, MR1, R4]
[MUM, MR1, R5]

MUM {MR1=[R4, R5]}
DEL {DR1=[R2, R1], DR2=[R3]}*/