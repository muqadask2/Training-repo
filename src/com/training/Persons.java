package com.training;

//public class EncapsulationPractice {// Class representing a Person
public class Persons {
	    // Private fields - encapsulated data
	    private String name;
	    private int age;

	    // Public method to set the name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Public method to get the name
	    public String getName() {
	        return name;
	    }

	    // Public method to set the age
	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Public method to get the age
	    public int getAge() {
	        return age;
	    }

	public class Main {
	    public static void main(String[] args) {
	        // Creating a Person object
	        Persons person1 = new Persons();

	        // Setting name and age using public methods
	        person1.setName("John");
	        person1.setAge(25);

	        // Accessing the name and age using public methods
	        System.out.println("Name: " + person1.getName());
	        System.out.println("Age: " + person1.getAge());
	    }
	}


}
