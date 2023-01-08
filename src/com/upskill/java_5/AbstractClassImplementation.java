package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass {

	@Override
	public void iDoor() {
	System.out.println("My car has 2 door !");	
		
	}

	@Override
	public int iWheel() {
		System.out.println("My car has 4 wheel !");	
		return 4;
	}

	@Override
	public String iEngine() {
		System.out.println("My car has 5 hp !");	
		return "5 hp";
	}
	
	public static void main(String[] args) {

AbstractClassImplementation ac = new AbstractClassImplementation();
ac=new AbstractClassImplementation();
ac.iDoor();
ac.iWheel();
ac.iEngine();
ac.car();
	}
	}

	

	
	

	
		



