package tanu31;

public class Pattern {

public static void main(String[] args) {
	int n=5;
	Pp(n);
	Pp1(n);
}

public static void Pp(int n)
{
	for (int i=0;i<n;i++)
	{
		for (int j=n-i;j>=1;j--)
		{
			System.out.print(" ");
		}
		for (int j=0;j<=i;j++)
		{
			
			if(j%2==0)
			{
				System.out.print(1);
			}
			else
			{
				System.out.print(0);
			}
			
		}
	System.out.println();
	}
}
public static void Pp1(int n)
{
	System.out.println();
	for (int i=1;i<=n;i++)
	{
		
		for (int j=n-i;j>=1;j--)
		{
			System.out.print(" ");
		}
		for (int j=1;j<2*i;j++)
		{
			System.out.print("* ");
		}
		
	System.out.println();
	}
}

}
