package test.captcha.tesseract;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass{


	@Override
	@Test
	public void m1() {
		
		System.out.println(super.s);
		super.m1();
		System.out.println(s);
	//m1(); - child class method
	}
}
