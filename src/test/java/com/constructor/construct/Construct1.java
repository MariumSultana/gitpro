package com.constructor.construct;

public class Construct1 {
String a, b;
	public Construct1(){
		
	}
public Construct1(String a, String b){
	this.a= a;
	this.b=b;
	}
	
	public void dance(){
		System.out.println("dance move for construc1");
	}
	
	public void sing(){
		System.out.println("sing move for construc1");
	}
	public void aDance(){
		System.out.println(a);
	}
	public void bSing(){
		System.out.println(b);
	}
}
