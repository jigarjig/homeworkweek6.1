
//3. Write a Java programme using the following steps.
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//
//3.4 Call both instance and static variables i
//nto both instance and static methods inside the print statement.

package week6;

public class Instance_Static {  // declare class
    int a = 10;  // Declare instance variable
    static String name = "jigar";  // declare static  variable

    void m1() {// Declare instance method
        System.out.println(a);  // called instance variable directly

    }


    void m2() // Declare static method
    {
        System.out.println(name); //called static variable directly
    }

        public static void main(String []args) { //declare both instance and static method inside print statement
            Instance_Static v = new Instance_Static();//create an object

            System.out.println();
            v.m1();
            v.m2();





    }




}
