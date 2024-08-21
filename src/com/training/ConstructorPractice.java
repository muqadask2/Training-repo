package com.training;

public class ConstructorPractice {
	
	//private static final String "" = null;


	public ConstructorPractice(){
		System.out.println("I am a constrctor");
	}
	public ConstructorPractice(int a){
		System.out.println("I am a constrctor,with one arrgument");
	}
	public ConstructorPractice(String s){
		System.out.println("I am a constrctor "  + s);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorPractice cp = new ConstructorPractice();

		ConstructorPractice cp1 = new ConstructorPractice(1);
		ConstructorPractice cp2 = new ConstructorPractice("Muqadas");

	}

}
