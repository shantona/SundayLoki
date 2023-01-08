package com.upskill.java_6;

public class Singleton {

     // singleton is class that can have only one object
	
	// private constructor, it prevents any other class from instantiating
	private Singleton(){
		
	
	}
		
	// private static object of the class
	private static Singleton SingletonObj = new Singleton();
	
	public static Singleton getInstance(){
		return SingletonObj; 
	}

	protected static void demo(){
		System.out.println("Demo method for singletone class");
	}
}