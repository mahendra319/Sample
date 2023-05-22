package demointerview;

import org.testng.annotations.Test;

public class PracticeForInterview {

	@Test
	public void occuranOfaCharFromString() {
		
	String str= "GeabeksForGeabeks";
		
		int firstOccurrance = str.indexOf('e');
		int secondOccurrance = str.indexOf('e', str.indexOf('e')+1);
		int thirdOccurrance = str.indexOf('e', str.indexOf('e', str.indexOf('e')+1)+1);
		int fourthOccurrance = str.indexOf('e',str.indexOf('e', str.indexOf('e', str.indexOf('e')+1)+1)+1);
		
		
		System.out.println("FisrtOccurrance :"+firstOccurrance);
		System.out.println("Second Occurance is: "+secondOccurrance);
		System.out.println("Third Occurrance is: "+thirdOccurrance);
		System.out.println("Fourth Occurrance is: "+fourthOccurrance);
	}
	
	@Test
	public void getNumberFromAlphaNum() {
		
		String str = "Employee Id : 1550569";
		
		System.out.println("Only number is: "+str.replaceAll("[^0-9]", ""));
	}
	
	
	@Test
	public void reverseString() {
		
		String str = "Texas";
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		System.out.println("Rever String using StringBuilder : "+sb.reverse());
		
		StringBuffer sf = new StringBuffer();
		
		sf.append(str);
		System.out.println("Reverse String using StringBuffer: "+sf.reverse());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
