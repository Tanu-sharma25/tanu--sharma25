import java.util.*;

class Operator
{
public static void main(String[] args) 
{
int a , b, var, res ;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a: ");
a = sc.nextInt();
System.out.println("Enter b: ");
b = sc.nextInt();
System.out.println("a + b = " + (a + b));
System.out.println("a - b = " + (a - b));
System.out.println("a * b = " + (a * b));
System.out.println("a / b = " + (a / b));
System.out.println("a % b = " + (a % b));

var = a;
System.out.println("var using =: " + var); 
var += a;
System.out.println("var using +=: " + var);
var *= a;
System.out.println("var using *=: " + var);

System.out.println("a is " + a + " and b is " + b);
System.out.println(a == b);  // false
System.out.println(a != b);  // true
System.out.println(a > b);  // false
System.out.println(a < b);  // true
System.out.println(a >= b);  // false
System.out.println(a <= b);  // true

System.out.println((a > b) && (8 > a));  // true
System.out.println((a > b) && (8 < a));  // false
System.out.println((a < b) || (8 > a));  // true
System.out.println((a > b) || (8 < a));  // true
System.out.println((a < b) || (8 < a));  // false
System.out.println(!(a == b));  // true
System.out.println(!(a > b));  // false

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

System.out.println (a & b); 
System.out.println (a | b); 
System.out.println (a ^ b); 
System.out.println (~a); 



  }
}





/*

public class BitwiseOperators 
{ 
public static void main (String[]args) 
{ 

System.out.println (a & b); 
System.out.println (a | b); 
System.out.println (a ^ b); 
System.out.println (~a); 

}
}

*/