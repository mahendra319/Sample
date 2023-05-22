package demointerview;

public class ChildClass extends ParentClass{

	public ChildClass() {
		System.out.println("Child Class Constructor");
	}
	public static void main(String [] args) {
		
		ChildClass obj = new ChildClass();
		obj.method1();
		
		int [] nums = new int[3];
		nums[0] =1;
		nums[1]=2;
		nums[2]=3;
		
		
	}
	
	
	@Override
	public  void method1() {
		System.out.println("Child class method");
		super.method1();
		
	
			}
	

	
	
}
