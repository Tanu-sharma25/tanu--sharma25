//program to display the functionality of different operators//

import java.util.*; //importing package

class Operator //class declaration
{
public static void main(String[] args) //main method
{
int a , b, var, res ; //variable declaration
Scanner sc = new Scanner(System.in); //scanner class to accept user input
System.out.println("Enter a: ");
a = sc.nextInt();
System.out.println("Enter b: ");
b = sc.nextInt();
  
  //arithematic operators
  
System.out.println("a + b = " + (a + b));
System.out.println("a - b = " + (a - b));
System.out.println("a * b = " + (a * b));
System.out.println("a / b = " + (a / b));
System.out.println("a % b = " + (a % b));
  
//assigment opeartors
  
var = a;
System.out.println("var using =: " + var); 
var += a;
System.out.println("var using +=: " + var);
var *= a;
System.out.println("var using *=: " + var);
  
//relational operators
  
System.out.println("a is " + a + " and b is " + b);
System.out.println(a == b);  // false
System.out.println(a != b);  // true
System.out.println(a > b);  // false
System.out.println(a < b);  // true
System.out.println(a >= b);  // false
System.out.println(a <= b);  // true
  
//logical operators
  
System.out.println((a > b) && (8 > a));  // true
System.out.println((a > b) && (8 < a));  // false
System.out.println((a < b) || (8 > a));  // true
System.out.println((a > b) || (8 < a));  // true
System.out.println((a < b) || (8 < a));  // false
System.out.println(!(a == b));  // true
System.out.println(!(a > b));  // false
  
//incement and decrement operators
  
System.out.println("Value of a: " + a);
res = ++a;
res = a++;
System.out.println("After increment: " + res );
System.out.println("After increment: " + res);
System.out.println("Value of b: " + b);
res = --b;
res = b++;
System.out.println("After decrement: " + res );
System.out.println("After decrement: " + res);
  
//Bitwise opeartors 
  
System.out.println (a & b); 
System.out.println (a | b); 
System.out.println (a ^ b); 
System.out.println (~a); 



  }
}





