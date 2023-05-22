package demointerview;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> eMap = new HashMap<String, String>();
		
		
		eMap.put("name", "Samhitha");
		eMap.put("DOB", "06/22/2021");
		eMap.put("BirthPlac", "SugarLand");
		eMap.put("Citizen", "USA");
		
		
		
		
		for (Map.Entry<String, String> emp: eMap.entrySet()) {
			
			System.out.println(emp.getKey()+" : "+emp.getValue());
		}

	for (String emp: eMap.keySet()) {
			
			System.out.println(emp);
		}
	
	
	for (String emp: eMap.values()) {
		
		System.out.println(emp);
	}
	}

}
