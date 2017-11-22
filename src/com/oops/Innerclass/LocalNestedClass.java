package com.oops.Innerclass;

public class LocalNestedClass {
	/*
	 * Local Inner Class-
	 * class declared inside method
	 * access all variables of outer class
	 * To access inner class we need to create instance inside method
	 * Local inner class has only abstract and final access modifiers allowed
	 */
	int i=10;
	private String name="Monali";
	final String colg="AVCOE";
	static int cnt=101;
	public void m1() {
		System.out.println("Inner class Inside Method:");
	  final class Innerclass{
		//  int i1=102;
		public void  m2() {
			System.out.println("Inner Class:");
			System.out.println("\nPrivate Member:"+name);
			System.out.println("\ndefault Member:"+i);
			System.out.println("\nStatic Member:"+cnt);
			System.out.println("\nFinal Member:"+colg);
		}
		
	}
	Innerclass ic=new Innerclass();
	ic.m2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalNestedClass ln=new LocalNestedClass();
		ln.m1();
		
	}

}
