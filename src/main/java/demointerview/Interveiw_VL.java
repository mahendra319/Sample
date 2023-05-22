package demointerview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class Interveiw_VL {
	//1. Read text file and count repetitive char 
	//2. read 10 numbers and display in ascending order
	
	
@Test
	public void readFile() throws IOException {
	String path ="S:\\Test.txt";
	
	File file = new File(path);
	
	BufferedReader br = new BufferedReader(new FileReader(file));
	
	String st;
	int count=0;
	while((st = br.readLine())!= null) {
		
		System.out.println(st);
		
		for(int i=0; i<st.length();i++) {
			
			if(st.charAt(i)=='t') {
				
				count++;
			
			
			}
			
			
		}
	}
	
	
	System.out.println(count);
	
	
}
	

}
