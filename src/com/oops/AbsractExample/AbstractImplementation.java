package com.oops.AbsractExample;

public class AbstractImplementation extends AbstractClass{

	public AbstractImplementation(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractImplementation a=new AbstractImplementation(101,"Monali");
		a.accept();
		a.display();

	}

	@Override
	void accept() {
		// TODO Auto-generated method stub
		System.out.println("Abtract Method implementation");
	}

}
