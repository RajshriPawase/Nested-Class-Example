package com.oops.AbsractExample;


public class InterfaceExample implements InterfaceEx {

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		System.out.println("Interface method");
		System.out.println(i);
		System.out.println(name);
	}
	public static void main(String[] args) {
		InterfaceExample ie=new InterfaceExample();
		ie.accept();
		ie.display();
	}
}
