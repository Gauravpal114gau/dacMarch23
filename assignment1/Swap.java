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
/*
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
		System.out.print("factorial of "+n+ fact);
	}
}
*/

import java.util.Scanner;
class swap{
		public static void main(String[] args)
		{
			int a, b, temp;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number");
			a=sc.nextInt();
			System.out.print("Enter the number");
			b=sc.nextInt();
			System.out.println("Enter the number A & B before swap isA:"+a+" B:"+b);
			/*a=a+b;
			b=a-b;
			a=a-b;*/
			temp=a;
			a=b;
			b=temp;
			
			
			System.out.println("Enter the number A & B After swap isA:"+a+" B:"+b);
			
		}
}
/*
Enter the number2
Enter the number3
Enter the number A & B before swap isA:2 B:3
Enter the number A & B After swap isA:3 B:2
*/