package com.oops.Innerclass;

public class MemberNestedClass {
	/*
	 * Member Inner Class-
	 * class declared outside method
	 * access all variables of outer class
	 * To access inner class we required to create instance of Outer class
	 * 
	 */
	int i=10;
	private String name="Monali";
	final String colg="AVCOE";
	static int cnt=101;
	public void m1() {
		System.out.println("Outer class:");
	}
	public class Innerclass{
		public void  m2() {
			System.out.println("Inner Class:");
			System.out.println("\nPrivate Member:"+name);
			System.out.println("\ndefault Member:"+i);
			System.out.println("\nStatic Member:"+cnt);
			System.out.println("\nFinal Member:"+colg);
		}
	}
	public static void main(String[] args) {
		MemberNestedClass m=new MemberNestedClass();
		m.m1();
		Innerclass ic=m.new Innerclass();
		ic.m2();
	}
}
