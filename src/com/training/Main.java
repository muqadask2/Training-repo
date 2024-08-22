package com.training;

/*public class ConstructorPractice {
	
	//private static final String "" = null;


	public ConstructorPractice(){
		System.out.println("I am a constrctor");
	}
	public ConstructorPractice(int a){
		System.out.println("I am a constrctor"  + 1);
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
*/
/*
//Abstraction and Encapsulation: Amazon class
class Amazon {
 private String orderId;
 private String product;

 // Constructor
 public Amazon(String orderId, String product) {
     this.orderId = orderId;
     this.product = product;
 }

 // Getter and Setter for orderId (Encapsulation)
 public String getOrderId() {
     return orderId;
 }

 public void setOrderId(String orderId) {
     this.orderId = orderId;
 }

 // Getter and Setter for product (Encapsulation)
 public String getProduct() {
     return product;
 }

 public void setProduct(String product) {
     this.product = product;
 }

 // Method to display order details (Polymorphism - Method Overriding)
 public void displayOrderDetails() {
     System.out.println("Order ID: " + orderId + ", Product: " + product);
 }
}

//Inheritance: Electronics class inherits from Amazon
class Electronics extends Amazon {
 private String warranty;

 // Constructor
 public Electronics(String orderId, String product, String warranty) {
     super(orderId, product); // Calling the parent class constructor
     this.warranty = warranty;
 }

 // Getter and Setter for warranty (Encapsulation)
 public String getWarranty() {
     return warranty;
 }

 public void setWarranty(String warranty) {
     this.warranty = warranty;
 }

 // Overriding the displayOrderDetails method (Polymorphism)
 @Override
 public void displayOrderDetails() {
     super.displayOrderDetails(); // Calling the parent class method
     System.out.println("Warranty: " + warranty);
 }
}

//Main class to demonstrate OOP concepts
public class AmazonWeb {
 public static void main(String[] args) {
     // Creating an Amazon object
     Amazon order1 = new Amazon("ORD123", "Book");
     order1.displayOrderDetails();

     // Creating an Electronics object
     Electronics order2 = new Electronics("ORD124", "Smartphone", "2 Years");
     order2.displayOrderDetails(); // This will call the overridden method in Electronics class
 }
}*/
//Class representing a Person
class Person {
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
}

public class Main {
 public static void main(String[] args) {
     // Creating a Person object
     Person person = new Person();

     // Setting name and age using public methods
     person.setName("John");
     person.setAge(25);

     // Accessing the name and age using public methods
     System.out.println("Name: " + person.getName());
     System.out.println("Age: " + person.getAge());
 }
}
