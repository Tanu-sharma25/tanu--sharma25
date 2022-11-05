//Q.4 Write a program to create online food order system
package ors; //package

import java.util.Scanner; //scanner pakage to accept user input



public class DELIstar //declaring a class
{ 

	public static void main(String[] args) //main method
	{
		Order();

	}
	public static void Order() //declaring method as order
	{
		Scanner n = new Scanner(System.in); //scanner to take user input
		
		
		int j, ch;
		
		String total = null;
		
		boolean order = false;
		do
		{
			boolean order1;
			
			System.out.println("-.-.-.-.-.MENU.-.-.-.-.-");
			System.out.println("|1.Chinese Dish        |160");
			System.out.println("|2.Korean Dish         |100");
			System.out.println("|3.Continental Dish    |105");
			System.out.println("|4.Indian Dish         |190");
			System.out.println("|5.Pakistani Dish      |100");
			System.out.println("|6.Afghan Dish         |150");
			System.out.println("|7.Japanese Dish       |200");
			System.out.println("|8.Thai Dish           |160");
			System.out.println("------------------------");
			
            ch = n.nextInt();
			int iP, fI;
			//String total;
			
			char a = 0;
			switch(ch)
			{
			case 1:
				fI=1;
				total += iP(fI);
				break;
			case 2:
				fI=2;
				total += iP(fI);
				break;
			case 3:
				fI=3;
				total += iP(fI);
				break;
			case 4:
				fI=4;
				total += iP(fI);
				break;
			case 5:
				fI=5;
				total += iP(fI);
				break;
			case 6:
				fI=6;
				total += iP(fI);
				break;
			case 7:
				fI=7;
				total += iP(fI);
				break;
			case 8:
				fI=8;
				total += iP(fI);
				break;
			case 9:
				done(total);
				break;
			
			default:
				System.out.println("Do you want to continue this process y/n?");
				a= n.next().charAt(0);
				break;
			
			}while(a=='y'|| a=='Y');
			
			System.out.println("Thanks For Coming");
			
		}
		while(order);		
		System.out.println("Total Amount: " + total);
		
		n.close();
	}
	private static void done(String total) {
		// TODO Auto-generated method stub
		
	}
	private static String iP(int fI) {
		// TODO Auto-generated method stub
		return null;
	}

}
