
//1. Write a Java programme using the following steps.
//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print
//statement. 1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and Run the programme.





package week6;

public class InstanceVariable { // declare class
    int a = 20, b = 30; // Declare Instance variable

    void m1() {  // declare Instance method
        System.out.println(a); // calling instance variable
        System.out.println(b); // calling instant variable


    }

    public static void main(String[] args ) { // declare main method
        InstanceVariable v = new InstanceVariable(); // create an  object
        v.m1(); // called the instance method


    }}
