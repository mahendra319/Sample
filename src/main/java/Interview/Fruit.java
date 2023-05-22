package Interview;

import java.util.ArrayList;

public class Fruit {
	
	
	String name = "";
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		
		Fruit fr = new Fruit("Apple");
		
		Fruit or = new Fruit("Orange");
		
		Fruit ba = new Fruit("Banana");
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
		for (String fName : fruits) {
			System.out.println(fName);
		}
		Fruit.reverse(fruits);
		
	}
	
	
	public static void reverse(ArrayList<String> sName) {
		
		int count = sName.size();
		
		
		
		System.out.println(count);
		for(int i=0; i<=count+1;i++) {
			int j = count-1;
			System.out.println(sName.get(j));
			count=count-1;
		}
		
		
	}
	

}
