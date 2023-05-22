import org.testng.annotations.Test;

public class JavaProgrammingQuestions {
	

	//public static void main(String [] args) {
		
@Test
	public void displayUnquieChars() {
		String str = "valuelabs";
		
		
		
		for(int i=0; i<str.length();i++) {
			
			int flag = 0;
			for(int j =0; j<str.length();j++) {
				
				
				if(str.charAt(i)==str.charAt(j) && i!=j) {
					
					flag =1;
					break;
				}
			}
			
			if(flag==0) {
				
				System.out.println(str.charAt(i));
			}
		}
		
	}

@Test
	public void reverseString_usingStringBuilder() {
	
		String city = "Houston";
		StringBuilder sb = new StringBuilder();
		
		sb.append(city);
		
		System.out.println(sb.reverse());
}


@Test
	public void reverseString_StringBuffer() {
	
		String name = "ValueLabs";
		
		StringBuffer sb = new StringBuffer();
		sb.append(name);
		System.out.println(sb.reverse());
}

@Test
	public void occurencesCountFromString() {
	
		String name ="ValueLabsagenda";
		
		int res =0;
		
		for(int i=0; i<name.length(); i++) {
			
			if(name.charAt(i)=='a') {
				
				res=res+1;
			}
		}
		System.out.println(res);
		
		
}

@Test
	public void findFactorialNumber() {
	
		int num =10;
		long fact = 1l;
		
		for(int i =1; i<=num;i++) {
			
			fact =fact*i;
		}
		
		System.out.println(fact);
}

@Test
	public void printFibonaciiSeries() {
	
		int n1=0, n2=1, n3, count =10;
		
		System.out.println(n1 +"\n "+n2);
		
		for(int i=2; i<count; i++) {
			
			n3=n1+n2;
			System.out.println(n3);
			
			n1=n2;
			n2=n3;
		}
}

@Test
	public void getNumberFromAlphanumeric() {
	
		String alphaNum = "Transaction id: 210230";
		
		System.out.println(alphaNum.replaceAll("[^0-9]", ""));
		
}




	
}
