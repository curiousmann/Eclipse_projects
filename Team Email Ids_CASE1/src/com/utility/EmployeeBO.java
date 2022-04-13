package com.utility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class EmployeeBO {

	public EmployeeBO() {
		super();
	}
	
	HashMap<String, ArrayList<String>> TeamEmailMap = new HashMap<String, ArrayList<String>>();
	public void addEmployeeDetails(String teamName, String officialMail) {
		ArrayList<String> al = new ArrayList<String>();
		if(TeamEmailMap.get(teamName.toLowerCase())!=null) {
			Iterator<String> iobj =TeamEmailMap.get(teamName.toLowerCase()).iterator();
			while(iobj.hasNext()) {
				al.add(iobj.next());
			}
		}
		al.add(officialMail);
		TeamEmailMap.put(teamName.toLowerCase(), al);
		
	}
	public int countOfOfficialMailIds(String teamName) {
		if(TeamEmailMap.get(teamName.toLowerCase())==null)
			return -1;
		return TeamEmailMap.get(teamName.toLowerCase()).size();
	}
}
