package com.oops.Innerclass;

abstract class AbstractNestedClass{
	abstract void mi();
}

public class AnnonymousClass extends AbstractNestedClass{
	AbstractNestedClass an=new AbstractNestedClass() {
		
		@Override
		void mi() {
			// TODO Auto-generated method stub
			System.out.println("Inner abstract class");
		}
		
	};
	AbstractNestedClass an1=new AbstractNestedClass() {
		
		@Override
		void mi() {
			// TODO Auto-generated method stub
			System.out.println("Secomd Abstract Class");
		}
	};

	@Override
	void mi() {
		// TODO Auto-generated method stub
		System.out.println("Abstact class method implementation");
	}
	public static void main(String[] args) {
		AnnonymousClass ac=new AnnonymousClass();
		ac.mi();
		ac.an.mi();
		ac.an1.mi();
	}

}
