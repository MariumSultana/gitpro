package com.constructor.construct;

public class Inheri extends Construct1{
	String a, b;
public Inheri(String a, String b){
	super.a= a;
	super.b = b;
}
	public void combo(){
		super.aDance();
		super.bSing();
		System.out.println("2 initialized constructors extended");
	}
}
