package demointerview;

public class PracJavaPro {
	
	
	public static void main(String args[]) {
		
		String str = "GeeksForGeeks";
		
		getOccurChar(str, 'G');
		
		System.out.println("**************************\n");
		
		getUniqueChar(str);
		
		System.out.println("*******************************\n");
		
		getRepetitiveChar(str);
		
		System.out.println(findFactorialNum(20));
		
		System.out.println("*************FibonacciSeries***************");
		
		fibonacciSeries(10);
		
	}
	
	
	
	public static void getOccurChar(String str,char a) {
		
		int res =0;
		
		for(int i=0; i<str.length();i++) {
			
			if(str.charAt(i)==a) {
				
				res =res+1;
			}
		}
		
		System.out.println(res);
	}
	
	public static void getUniqueChar(String str) {
		
		for(int i=0; i<str.length();i++) {
			
			int flag =0;
			
			for(int j =0;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j) && i!=j) {
					
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				
				System.out.println(str.charAt(i));
			}
		}
	}
	
	public static void getRepetitiveChar(String str) {
		
		for(int i=0; i<str.length();i++) {
			
			int flag =0;
			
			for(int j=0;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j) && i!=j) {
					
					flag=1;
					break;
				}
			}
			
			if(flag==1) {
				
				System.out.println(str.charAt(i));
			}
		}
	}
	
	
	public static long findFactorialNum(int num) {
		
		long fact=1;
		for(int i=1; i<=num;i++) {
			
			fact = fact*i;
		}
		//System.out.println("Factorial of 10: "+fact);
		
		return fact;
	}
	
	
	
	public static void fibonacciSeries(int count) {
		
		int n1=0, n2=1,n3;
		System.out.println(n1+"\n"+n2);
		
		for(int i=2;i<count;i++) {
			
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
