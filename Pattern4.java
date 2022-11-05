/*write a program to display following pattern
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  */

package tanu31; //importing package 

import java.util.Scanner; //importing scanner class

public class Pattern4 //declaring class
{
	public static void main(String[] args) //declaring main method
	{
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in); //accept the user input
		    System.out.println("Enter the number of rows: ");
		    int rows = 5, k = 0; //declaring variables

		    for (int i = 1; i <= rows; ++i, k = 0) 
		    {
		      for (int space = 1; space <= rows - i; ++space) //displaying the space 
		      {
		        System.out.print("  ");
		      }

		      while (k != 2 * i - 1)
		      {
		        System.out.print("* "); 
		        ++k;
		      }

		      System.out.println();
		    }


	}
	}
