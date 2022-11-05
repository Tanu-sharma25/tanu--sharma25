/*write a program to display following pattern
****
*  *
*  *
****   */

package tanu31; //importing package

import java.util.Scanner; //importing scanner class

public class Pattern3 //declaring class
{
	public static void main(String[] args) //main method
	{
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++) //for displaying row
		{
		for(int j=0;j<4;j++) //for displaying column
		{
		if(i==0||j==0||j==3||i==3) //for displaying the mentioned pattern
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
		}

	}


	}
