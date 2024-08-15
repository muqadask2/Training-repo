package com.training;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare variables
	    int a = 12, b = 5;

	    // addition operator
	    System.out.println("a + b = " + (a + b));

	    // subtraction operator
	    System.out.println("a - b = " + (a - b));

	    // multiplication operator
	    System.out.println("a * b = " + (a * b));

	    // division operator
	    System.out.println("a / b = " + (a / b));

	    // modulo operator
	    System.out.println("a % b = " + (a % b));
	    System.out.println("\n");
	    
	    //////////////////////////////////////////////////
	    //By chananging the value of a and b as a double 
	    
	    double a1 = 12.0, b1 =  5.0;

	    // addition operator
	    System.out.println("a1 + b1 = " + (a1 + b1));

	    // subtraction operator
	    System.out.println("a1 - b1 = " + (a1 - b1));

	    // multiplication operator
	    System.out.println("a1 * b1 = " + (a1 * b1));

	    // division operator
	    System.out.println("a1 / b1 = " + (a1 / b1));

	    // modulo operator
	    System.out.println("a1 % b1 = " + (a1 % b1));
	    System.out.println("\n");
	    
	    /////////////////////////////////////////////////////////
	    //by chananging the value of a and b as a float
	    float a11 = 12.3345f, b11 =  5.3345f;

	    // addition operator
	    System.out.println("a11 + b11 = " + (a11 + b11));

	    // subtraction operator
	    System.out.println("a11 - b11 = " + (a11 - b11));

	    // multiplication operator
	    System.out.println("a11 * b11 = " + (a11 * b11));

	    // division operator
	    System.out.println("a11 / b11 = " + (a11 / b11));

	    // modulo operator
	    System.out.println("a11 % b11 = " + (a11 % b11));
	    System.out.println("\n");
	    
	    /////////////////////////////////////////////////////////
	    //Assisgment operator with example
	    
	 // create variables
	    int a111 = 4;
	    int var;

	    // assign value using =
	    var = a111;
	    System.out.println("var using =: " + var);

	    // assign value using =+
	    var += a111;
	    System.out.println("var using +=: " + var);

	    // assign value using =*
	    var *= a111;
	    System.out.println("var using *=: " + var);
	    System.out.println("\n");
	    
	    ////////////////////////////////////////////////////
	    //Relational Operators with example
	    
	    // create variables
	    int a1111 = 7, b111 = 11;

	    // value of a and b
	    System.out.println("a is " + a1111 + " and b is " + b111);

	    // == operator
	    System.out.println(a1111 == b111);  // false

	    // != operator
	    System.out.println(a1111 != b111);  // true

	    // > operator
	    System.out.println(a1111 > b111);  // false

	    // < operator
	    System.out.println(a1111 < b111);  // true

	    // >= operator
	    System.out.println(a1111 >= b111);  // false

	    // <= operator
	    System.out.println(a1111 <= b111);  // true
	    System.out.println("\n");
	    
	   ////////////////////////////////////////////////////////////////////
	    //Logical Operators
	    
	 // && operator
	    System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 > 3) || (8 < 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false

	    // ! operator
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false
	    System.out.println("\n");
	    
	    ///////////////////////////////////////////////////////////////////
	    //Increment and Decrement Operators
	    
	 // declare variables
	    int a11111 = 12, b1111 = 12;
	    int result1, result2;

	    // original value
	    System.out.println("Value of a: " + a11111);

	    // increment operator
	    result1 = ++a11111;
	    System.out.println("After increment: " + result1);

	    System.out.println("Value of b: " + b1111);

	    // decrement operator
	    result2 = --b1111;
	    System.out.println("After decrement: " + result2);
	    System.out.println("\n");
	    
	    
	}

}
