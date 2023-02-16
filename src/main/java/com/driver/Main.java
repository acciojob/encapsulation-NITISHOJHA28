package com.driver;

public class Main {
	public static void main(String[] args) {
		RWOnly rwOnly = new RWOnly();
		//rwOnly.name;
		//Unresolved compilation problems
		rwOnly.setName("Harshad");
		System.out.println(rwOnly.getName());
	}
}
