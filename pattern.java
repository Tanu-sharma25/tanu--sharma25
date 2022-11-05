/*write a program to display following pattern
A
BC
DEF
GHIJ
KLMNO */

package tanu31; // importing package
public class pattern {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		char ch = 'A'; //declaring character variable

		for (int i = 0; i <= 4; i++) {

		for (int j = 0; j <= i; j++) {

			System.out.print(ch++);}

		System.out.println();

		}

	}

}
