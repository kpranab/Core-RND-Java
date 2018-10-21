package com.rnd.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class OutdatedVersionFinder {

	private static final String INPUT_FILE = "input.txt";
	private static final String OUTPUT_FILE = "output.txt";
	
	public boolean findOutdatedVersion(){
		Map<String, List<ServerAdministratorBean>> inputMap = getInput(INPUT_FILE);
		List<String> outputList = getResult(inputMap);
		return writeResult(outputList);
	}

	public Map<String, List<ServerAdministratorBean>> getInput(String input){
		
		Map<String, List<ServerAdministratorBean>> inputMap = new HashMap<>();
		File loadFile = loadFile(input);
		try (BufferedReader br = new BufferedReader(new FileReader(loadFile))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line != null) {
					String[] split = line.split(",");
					if (inputMap.containsKey(split[2])) {
						List<ServerAdministratorBean> list = inputMap.get(split[2]);
						list.add(new ServerAdministratorBean(split[0], split[1], split[2], split[3].trim()));
						inputMap.put(split[2], list);
					} else {
						List<ServerAdministratorBean> serverList = new ArrayList<>();
						serverList.add(new ServerAdministratorBean(split[0], split[1], split[2], split[3].trim()));
						inputMap.put(split[2], serverList);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inputMap;
	}

	public List<String> getResult(Map<String, List<ServerAdministratorBean>> map){
		List<String> outputList = new ArrayList<>();
		// Retrieving from Map and sort if list contains more than 1 element and
		// get the 1st element
		Set<Entry<String, List<ServerAdministratorBean>>> entrySet = map.entrySet();
		for (Entry<String, List<ServerAdministratorBean>> entry : entrySet) {
			int size = entry.getValue().size();
			if (size > 1) {
				Collections.sort(entry.getValue(), new VersionComparator());
				outputList.add(entry.getValue().get(0).getServerName());
			}
		}
		return outputList;
	}
	
	// Write to file
	public boolean writeResult(List<String> outputList) {
		boolean flag = true;
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
			for (String outdatedVersion : outputList) {
				bw.write(outdatedVersion + "\n");
			}
		} catch (IOException e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}

	//Load File
	public File loadFile(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		return new File(classLoader.getResource(fileName).getFile());
	}

}

class VersionComparator implements Comparator<ServerAdministratorBean> {

	@Override
	public int compare(ServerAdministratorBean o1, ServerAdministratorBean o2) {
		String[] arr1 = o1.getVersion().split("\\.");
		String[] arr2 = o2.getVersion().split("\\.");

		int i = 0;
		while (i < arr1.length || i < arr2.length) {
			if (i < arr1.length && i < arr2.length) {
				if (Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])) {
					return -1;
				} else if (Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])) {
					return 1;
				}
			} else if (i < arr1.length) {
				if (Integer.parseInt(arr1[i]) != 0) {
					return 1;
				}
			} else if (i < arr2.length) {
				if (Integer.parseInt(arr2[i]) != 0) {
					return -1;
				}
			}
			i++;
		}
		return 0;
	}
}

class ServerAdministratorBean {

	private String serverName;
	private String serverType;
	private String softwareName;
	private String version;

	public ServerAdministratorBean(String serverName, String serverType, String softwareName, String version) {
		super();
		this.serverName = serverName;
		this.serverType = serverType;
		this.softwareName = softwareName;
		this.version = version;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerType() {
		return serverType;
	}

	public void setServerType(String serverType) {
		this.serverType = serverType;
	}

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
