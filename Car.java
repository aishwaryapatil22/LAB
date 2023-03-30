package assignment;


public class Car {
	  String make;
	  String model;
	  int year;

	  public void start() {
	    System.out.println("Starting the " + year + " " + make + " " + model);
	  }
	

	
	  public static void main(String[] args) {
	    // Instantiate a Car object
	    Car myCar = new Car();

	    // Initialize the object's properties
	    myCar.make = "Toyota";
	    myCar.model = "Camry";
	    myCar.year = 2022;

	    // Use the object
	    myCar.start();
	  }
	}
