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
/*
import java.util.Scanner;
class swap{
		public static void main(String[] args)
		{
			int a; int b;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number");
			a=sc.nextInt();
			System.out.print("Enter the number");
			b=sc.nextInt();
			System.out.println("Enter the number A & B before swap isA:"+a+" B:"+b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("Enter the number A & B After swap isA:"+a+" B:"+b);
			
		}
}
/*
/*
Enter the number3
Enter the number4
Enter the number A & B before swap isA:3 B:4
Enter the number A & B After swap isA:4 B:3
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
		if(n>0)
		{
			System.out.print("Enter the number" +n+ "Positive");
			else if(n<0)
			{
			System.out.print("Enter the number" +n+ "Negative");
			}
			else{
				
			System.out.print("Enter the number" +n+ "Negative");
			}
		}
	}
	
}
*/

 class Leap_Year
 {
	 int n= 2020;
	 
		 if (n%400==0)||((n%4==0) && (n%100!=0))
	{ 
         System.out.print("Leap Year");
	}
       else	
	   {
		   System.out.print(" Non Leap Year");
	   }
 }	   
	   
	   
/*
   import java.util.Scanner;
   class Factor{
	   
   public static void main(String[] args)
   {
	   int input, int i;
		   System.out.println("Enter the number");
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number");
		   input=sc.nextInt();
	     System.out.println("Factor="+input+" are");
		 {
			 for(int i=1;i<=input;++i)
			 {
				 if(input%==0)
				 {
					 System.out.println(i+" ");
				 }
			 }
		 }
   }
 }
 */