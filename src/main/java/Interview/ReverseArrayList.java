package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {

		 List<Integer> list = new ArrayList<>();  
	     list.add(10);  
	     list.add(50);  
	     list.add(30);  
	     
	     
	     Iterator<Integer> i = list.iterator();  
	     System.out.println("printing the list....");  
	     while(i.hasNext())  
	     {  
	         System.out.println(i.next());  
	     }  
	     
	     
	     Iterator<Integer> i2 = list.iterator();  
	     Collections.reverse(list);  
	     System.out.println("printing list in reverse order....");  
	     while(i2.hasNext())  
	     {  
	         System.out.println(i2.next());  
	     }  
	}

}
