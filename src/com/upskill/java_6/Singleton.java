package com.upskill.java_6;

public class Singleton {

  private  Singleton(){
	  

		// Singleton is class that can have only object
		
		// Private constructor, it prevents any other class from instantiating
			  
	  
	  }


// private static object of the class
 private static Singleton SingletonObj = new Singleton();
 
   public static Singleton getInstance(){        //  factory method
	   return SingletonObj;
	   
   }

   protected static void demo(){
	   System.out.println("Demo method for singleton class");
	   
   }
   
}
