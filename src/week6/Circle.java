// Write a program to enter any radius value of the circle and find out the
   //     area.(Formula of Area A=PI*r*r).


package week6;
import java.util.Scanner;
public class Circle { // Declare class name
    public static void main (String args[]){ // Declare main method
        double radius, area;
        final double PI=3;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        radius = input.nextDouble();
        area   =PI * radius * radius;
        System.out.println("Area of circle=" + area);
    }


}
