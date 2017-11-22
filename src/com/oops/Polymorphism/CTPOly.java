package com.oops.Polymorphism;

class MOExample
{
	public void  ADD(float i,Double j) {
		System.out.println("Addition of super class(int,double)="+(i+j));
	}
}
public class CTPOly extends MOExample{
	public void  ADD(int i,int j) {
		System.out.println("Addition(int,int)="+(i+j));
	}
	public void  ADD(int i,float j) {
		System.out.println("Addition(int,float)="+(i+j));
	}
	public void  ADD(float i,Double j) {
	
		System.out.println("Addition(int,double)="+(i+j));
	}
	public static void main(String[] args) {
		CTPOly ct=new CTPOly();
		ct.ADD(10, 10.0);
	}
}

