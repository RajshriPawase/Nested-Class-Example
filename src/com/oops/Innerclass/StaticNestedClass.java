package com.oops.Innerclass;

public class StaticNestedClass {
	/*
	 * Static Inner Class-
	 * 	Access only Static variable of outerclass
	 * We can acces innerclass directly by using class name of outerclass
	 * We does not required instance of Outer class
	 */
	 int i=10;
	static int count=101;
	public static void m2() {
		
		System.out.println("Outer class method");
	}
	static class StaticInnerClass{
		public void m1()
		{
			m2();
			System.out.println("Inside Innner class:"+"\n"+"Static field:"+count);
		}
	}
	public static void main(String[] args) {
	
		StaticNestedClass.StaticInnerClass si=new StaticNestedClass.StaticInnerClass();
		si.m1();
		
		
	}

}
