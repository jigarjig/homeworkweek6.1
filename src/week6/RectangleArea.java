//14. Write a Java program to print the area and perimeter of a rectangle.
//
//Test Data:
//Width = 5.5 Height = 814. Write a Java program to print the area and perimeter of a rectangle.
//
//Test Data:
//Width = 5.5 Height = 8.5


package week6;

public class RectangleArea {


    public static void main(String[] args) {
         double width =5.6d;
         double height =8.5d;

        double perimeter = 2*(height + width);
        double area =width * height;


        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height,width,perimeter );
        System.out.printf("Area is %.1f * %.1f = %.2f \n",width,height,area);
    }


}
