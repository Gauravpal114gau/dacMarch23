/*
import java.util.Scanner;
class Even_Odd{
	 public static void main(String[] args)
	{
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number");
		n=sc.nextInt();
		 if(n%2==0)
		{
		   System.out.println("number is "+" Even");	
		}
		else
			System.out.print("number is"+" Odd");
	}
}
*/

import java.util.Scanner;
 class Factorial{
	public static void main(String[] args)
	{
		int n, fact=1;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print("factorial of " + fact);
	}
}

/*
Enter the number5
factorial of 120
*/