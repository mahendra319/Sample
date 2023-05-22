package demointerview;

public class FinallyBlock {

	
	public static void main (String [] args) {
		
		try {
		int i = 1/0;
		
		System.out.println(i);
		}
//		catch(NullPointerException e) {
//			System.out.println("Arthmetic exception");
//		}
		finally {
			
			System.out.println("Finally Block always executed whether exception handled or not");
		}
		
		System.out.println("Last statement in the program");
	}
}
