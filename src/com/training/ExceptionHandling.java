package com.training;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b , c = 0;

		try {
			System.out.println(a / c);
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("I am finally block");
		}

	}

}
