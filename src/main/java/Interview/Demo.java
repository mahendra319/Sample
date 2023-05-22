package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Demo {

	
	public Demo() {
		
	}
	public static void main(String[] args) {
		
		System.out.println(findFactorialOfNumber(10));
		
	//find number of occurrences of a char in a given string	
		String s = "GeeksforGeeks";
		
		int res =0;
		
		for(int i=0; i<s.length();i++) {
			
			if(s.charAt(i)=='e') {
				res=res+1;
			}
		}
		
		System.out.println(res);
		
		
		//find unique char from a string
		
		for(int i =0; i<s.length();i++) {
			
			int flag =0;
			
			for(int j=0; j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j) && i!=j) {
					flag =1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(s.charAt(i));
			}
		}
		
		//
		
		String str = "Employee id is: 1550569";
		
		System.out.println(str.replaceAll("[^0-9]", ""));
		System.out.println(str.replaceAll("[0-9]", ""));
		
		List<String> a = new ArrayList<String>();
		a.add("samhi");
		//System.out.println(a.get(1));//java.lang.IndexOutOfBoundsException:Index: 1, Size: 1
		System.out.println(a.get(0));
		//System.out.println(a.get(-1));//ArrayIndexOutOfBoundsException: -1
		
		String [] str1 = {"Mahika"};
		//System.out.println(str1[1]); //java.lang.ArrayIndexOutOfBoundsException: 1
		
		new Demo().sumOf2Nums(10, 20); //Anonymous Object - means object without reference. For one time use we can create this kind of objects
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "Samhi");
		
		System.out.println(map.get("name")); // return samhi
		System.out.println(map.get("country")); // return null
	}
	
	
	public void throwKeyword() throws ClassNotFoundException {
		
		
		 throw new ClassNotFoundException("Class doesn't exists");
	}
	public void sumOf2Nums(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static long findFactorialOfNumber(int num) {
		
		
		long fact =1;
		
		for(int i=1; i<=num; i++) {
			
			fact=fact*i;
		}
		return fact;
	}
	
	
	
	
}
