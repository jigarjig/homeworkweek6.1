//2. Write a Java programme using the following steps.
//2.1 Declare two static variables
//2.2 Declare one static method
//2.3 Call both static variables into the static method inside the print
//statement. 2.4 Declare the Main method.
//2.5 Call the static method into the Main method and Run the progra2. Write a Java programme using the following steps.
//2.1 Declare two static variables
//2.2 Declare one static method
//2.3 Call both static variables into the static method inside the print
//statement. 2.4 Declare the Main method.
//2.5 Call the static method into the Main method and Run the programme.


package week6;

import java.sql.SQLOutput;

public class Static_Steps { // declare class
    static double c = 25.25; //Declare static variable
    static String name = "Jigar"; // Declare static variable


    static void m2() //Declared static method
    {
        System.out.println(c);
        System.out.println(name);
    }

        public static void main(String [] args) { // declared static method into the main method
        Static_Steps v = new Static_Steps ();
        v.m2();





    }
















}
