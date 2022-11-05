
//Write a java program to calculate the simple interest//

import java.util.Scanner; //importing package to use scanner class
public class PrtInterest // class declaration
{ 
public static void main(String args[]) //main method
{ 
float p, r, t, sinterest; //variable declaration
Scanner scan = new Scanner(System.in); //scanner class to accept user input
System.out.print("Enter the Principal : "); 
p = scan.nextFloat();
System.out.print("Enter the Rate of interest : "); 
r = scan.nextFloat(); 
System.out.print("Enter the Time period : "); 
t = scan.nextFloat(); 
scan.close(); 
sinterest = (p * r * t) / 100; //formula used to calculate simple interest
System.out.print("Simple Interest is: " +sinterest); 
} 
}
