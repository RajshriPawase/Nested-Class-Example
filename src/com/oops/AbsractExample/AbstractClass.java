package com.oops.AbsractExample;

public abstract class AbstractClass {
	int id;
	String name;
	abstract void accept();
	static void display()
	{
		System.out.println("Concrete method in abstract class");
	}
	public AbstractClass(int id, String name) {
		System.out.println("Parameterized constructor");
		this.id = id;
		this.name = name;
	}
	public AbstractClass()
	{
		System.out.println("Abstract Constructor");
	}
	public static void main(String[] args) {
		AbstractClass ab=new AbstractClass(101,"Monali") {
			
			@Override
			void accept() {
				// TODO Auto-generated method stub
				System.out.println("Annoynomous method");
			}
			
		};
	}
	
}

