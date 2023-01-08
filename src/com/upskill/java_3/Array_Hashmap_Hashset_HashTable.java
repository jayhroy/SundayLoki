package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
//Array store multiple data using index
		
int age = 30;	                                           //Variable
	int[] ageLoki = new int[] { 25, 30, 35, 38, 40,};	        //Array
		
	//Array index             [0]  [1]  [2]  [3]  [4]	
		
	System.out.println("Student Age : " + ageLoki[4]);
	System.out.println("Total Student : " + ageLoki.length );
	
	String[]nameLoki=  new String[]{"Jay", "Anik", "Badsha", "Taniya", "Kader"};
	System.out.println("Student name : " + nameLoki[0]);
	System.out.println("Total Student name : " + nameLoki.length );
	
		
//Multi- Dimentional Array
	int [][] ageLoki3D = {{25, 30, 35, 38, 40},       //[0][0] [0][1] [0][2] [0][3] [0][4]
	                     { 26, 30, 35},                  //[1][0] [1][1] [1][2] [1][3] [1][4] 
	                     { 27, 40, 20}};                //[2][0] [2][1] [2][2] [2][3] [2][4]
	
	
	
	System.out.println("Student Age 3D : " + ageLoki3D[2][0]);
	
	// Hashmap store multiple data using key-value pair, Implementation of Map interface
	
	HashMap<String, Integer> Student = new HashMap<String, Integer>();

	Student.put("Anik", 25);
	Student.put("Badsha", 31);
	Student.put("Mizu", 28);
	Student.put("Humayra", 18);
	
	System.out.println("HashMap Student Age : "+ Student.get("Mizu"));
	
	HashMap<String, String> Capital = new HashMap<String, String>();
	Capital.put("BD","Dhaka");
	Capital.put("USA","Washingtin DC");
	System.out.println("Capital city : " + Capital.get("BD"));
	
	
	//Hashset store unordered collection containing unique value, Implementation of Set interface
	
	HashSet<String> car = new HashSet<String>();
	car.add("BMW");
	car.add("Toyota");
	car.add("Audi");
	car.add("Ford");
	
	System.out.println("Car : " + car);
	
	//HashTable store multiple data using key-value pair, no duplicate also is synchronized (only one thread can be modified)
	
	Hashtable<String, String> Region = new Hashtable<String, String>();
	Region.put("USA", "Asia");
	Region.put("USA", "America");
	System.out.println("Region : " + Region.get("USA"));
}
}



	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
