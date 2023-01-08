package com.upskill.assignment_3;

public class Assignment_3_3 {
	
	
	void displayInterestRate() {
	System.out.println("Default interest rate is NONE");
	}
	

	public static void main(String[] args) {
	 problem3 obj = new ChaseBank();
	 ((ChaseBank) obj).displayInterestRate();
	// new.cityBank().displayInterestRate();
//	 new.TDBank().displayInterestRate();
	
	 }
     }
     class ChaseBank extends problem3{
    	 void displayInterestRate() {
    		 System.out.println("Chase bank interest rate is 8%");
      }
      }
     class CityBank extends problem3{
    	 void displayInterestRate() {
    		 System.out.println("City bank interest rate is 7%");
     }
     }
     class TDBank extends problem3{
    	 void displayInterestRate() {
      System.out.println("TD bank interest rate is 9%");
    	 }
     }
     
     
     
     
     
     