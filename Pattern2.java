/*write a program to display following pattern
  
*********
 *******
  *****
   ***
    *  */

package tanu31; //importing package

import java.util.Scanner; //importing scanner class 

public class Pattern2 //decalring a class
{
	public static void main(String[] args) //main method
	{
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) //printing no of rows 
		{
			for(int j=5;j>i;j--)// printing no of columns
			{
				System.out.print(" ");
			}
			for (int j=1;j<=(2*i-1);j++) //displaying pattern
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}}
