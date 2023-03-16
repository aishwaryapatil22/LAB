// Q3. Write a Java program to swap two variables.

class swap{

public static void main(String args[]) {

	int a=110;
	int b=250;
	int temp;

	System.out.println("before swap the value of A is: 110");
	System.out.println("before swap the value of B is: 250");

     temp = a;
     a = b;
     b = temp;

	System.out.println("After swap the value of A is: "+a);
	System.out.println("After swap the value of B is: "+b);

}
}