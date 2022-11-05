//write a java program to find the area and circumference of the circle also take radius as user input//

import java.util.*; //impoting util package

public class CircleArea //declaring a class
{
public static void main(String[] args) // main method
{
double radius, area, circumference; //variable declartion
Scanner in = new Scanner(System.in); //scanner class to accept user input
System.out.println("Enter Radius of Circle:");
radius = in.nextDouble();
area = Math.PI * radius * radius; //calculating area of the circle 
circumference = 2 * Math.PI * radius; //calculating circumference of the circle
System.out.println("Area of Circle : " + area);
System.out.println("Circumference of Circle : " + circumference);
}
}
