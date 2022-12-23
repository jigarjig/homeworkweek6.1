//4. Write a Java programme using the following steps.
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.


package week6;

public class Four{  // Declare class
    int a =5, b=10;  // Declare Instance Variables
    static String name = "Jigar";  // declare static variable
    static String surname = "Patel"; // declare static variable


void m1() {  // Declare instance method
    System.out.println(a); // print instance variable
    System.out.println(b); // print instance variable

}
void m2(){  // Declare static method
    System.out.println(name); // print static variable
    System.out.println(surname); // print static variable

}

public static void main(String []args)  // Declare main method
{
    Four v =new Four(); //create an object
    v.m1();
    v.m2();


}

}
