package com.oops.AbsractExample;

public interface InterfaceEx {
	int i=101;
	String name="Monali";
	void accept();
	default void display()
	{
		System.out.println("Hello");
	}

}
