

import java.util.Scanner;
class Positive_Negative
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Enter the number" +n+ "Positive");
		}
			else 
			{
			System.out.println("Enter the number" +n+ "Negative");
			}
			
		}
	}
	
	
/*	
	Enter the number10
Enter the number10Positive

Enter the number-15
Enter the number-15Negative

*/
/*
import java.util.Scanner;
class Positive_Negative
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		n=sc.nextInt();
		if( n>0 || n<0 && n<0 || n>0)
		{
			System.out.println("Enter the number" +n+  "Positive");
		}
		else
		{
		System.out.println("Enter the number" +n+ "Negative");
		}
	}
}
*/