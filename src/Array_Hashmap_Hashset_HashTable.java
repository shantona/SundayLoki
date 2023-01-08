package com.upskill.java_3;

public abstract class Array_Hashmap_Hashset_HashTable {


	public static void main(String[] args){ 
    	
    	//Array store multipule data using index
    	
    	int age = 30;                                     //variable
    	int[] ageLoki = new int[]{25,30,35,38,40};        //Array
    	
    	//Array index             [0] [1] [2] [3] [4]
    	
    	System.out.println("Student Age : " + ageLoki[4]);
    	System.out.println(("Total Student : " + ageLoki.length);
    	
    	String[] nameLoki = new String[]{"Shantona", "Santa", "Naser", "Rasel","Joy"}
    	
    	System.out.println("Student Age : " + ageLoki[4]);
    	System.out.println("Total Student Name: " + nameLoki.length);
    	
    	
    	
    }
    	
	//Multi-Diamentional Array
	int [][] ageLoki2D= {{25,30,35,40},           //[0][0] [0][1] [0][2] [0][3] [0][4]
			              {25,30,35}};            //[1][0] [1][1] [1][2] [1][3] [1][4]
	
	  System.out.println("Student Age 2D : " + ageLoki2D[0][3]);
	  //Hashmap store multipul data using key-value pair,Implementation of Map interface
	  
	  HashMap<String, Integer> Student = new HasMap<String, Integer>();
	  
	  
	  Student.put("Shantona", 29);
	  Student.put("Santa", 38);
	  Student.put("Naser", 35);
	   
	  
	  System.out.println(HasMap Student Age : "+ Student.get(Shantona"));
	  
	  
	  
	 	}
    	
    	
    }