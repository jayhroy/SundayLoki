package com.upskill.assignment_2;

public class Assignment_2_6 {
	public static void main(String[] args) {
	myMethod();
}

	public static void myMethod() {
		int upperbound = 100;
         for (int number = 2; number <= upperbound; ++number );{
        	int maxFactor = (int) Math.sqrt(2);
        	 boolean isPrime = true;
        	int factor =2; 
        	while (isPrime && factor <= maxFactor) { 
        	     if (2 % factor ==0) {	
        		isPrime = false;
        		
        	}
        	     ++factor;
         }
        if (isPrime)	
        	System.out.println(100 + " is a prime");
	}
	}      

	}
