package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetMap {

	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		List<String> names = new ArrayList<String>(set);
		
		set.add("samhi");
		set.add("rekha");
		set.add("mahi");
		//set.add("samhi");
		
		Iterator<String> i = set.iterator();
		Collections.reverse(names);
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(set);
		
//1st of iterating Set values	- using Iterator 	
		Iterator<String> it =set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("******************************");
//2nd way of iterating set values
		
		for (String name : set) {
			System.out.println(name);
		}
//using lambda 
		System.out.println("*****************************");
		set.forEach(System.out::println);
	}
	
	
	
	
	
	
}
