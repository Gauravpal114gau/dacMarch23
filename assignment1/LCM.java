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
/*
 class Leap_Year
 {
	 int n= 2020;
	 
		 if((n%400=0)||((n%4==0)&&n%100!=0))
	{ 
         System.out.print("Leap Year");
	}
       else	
	   {
		   System.out.print(" Non Leap Year");
	   }
*/
/*
   import java.util.Scanner;
   class Factor{
	   
   public static void main(String[] args)
   {
	   int input; int i;
		   System.out.println("Enter the number");
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number");
		   input=sc.nextInt();
	     System.out.println("Factor="+input+" are");
		 {
			 for(int i=1;i<=input;++i)
			 {
				 if(input%i==0)
				 {
					 System.out.println(i+" ");
				 }
			 }
		 }
   }
 }
 */
 
 /*
 import java.util.Scanner;
 class Sum{
	   public static void main(String[] args)
	   {
		   int m; int n;  int sum=0;
		     Scanner sc = new Scanner(System.in);
			    System.out.print("Enter the number");
				m=sc.nextInt();
				while(m>0)
				{
				  n=m%10;
				  sum=sum+n;
				  m=m/10;
				}
				   System.out.println("sum of digit"+ sum);
	   }
	   
 }
 */
 /*
 Enter the number234
sum of digit9
*/
/*
class SmallestInThree{
	public static void main(String[]args)
	{
		int a=20;
		int b=10;
		int c=30;
		int Smallest=(a<b)?(a<c?a:c):(b<c?b:c);
		{
	      		System.out.println(Smallest+" is the smallest");
		}
	}
}
*/
/*
10 is the smallest
*/

/*
import java.util.Scanner;
class Reverse{
	public static void main(String[]args)
	{
	int m; int n; int sum=0;
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number");
	  m=sc.nextInt();
	  while(m>0)
	  {
		  n=m%10;
		  sum=sum*10+n;
		  m=m/10;
	  }
	  System.out.println("Reverse of the number"+sum);
    }
  }
*/
/*
Enter the number2345
Reverse of the number5432
*/
/*
import java.util.Scanner;
class GCD{
	static int gcd(int x ,int y);
	{
		int r=0,a,b;
		a=(x>y)?x:y;
		b=(x<y)?x:y;
		r=b;
		while(a%b!=0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		return r;
	}
	public static void main(String[]args);
	 Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the number");
	   int x= sc.nextInt();
	   int y= sc.nextInt();
	   
		     System.out.print("Gcd of two number"+ gcd(x,y)); 
	   
}
*/

import java.util.Scanner;
class LCM{
		static int lcm(int x , int y)
		{
		  int a;
		  a = (x>y) ? x : y;
		while(true)
		{
			if((a%x==0)&&(a%y==0))
				return a;
			++a;
		}
}
public static void main(String[]args)
{
	 Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number: ");
	   int x= sc.nextInt();
	   int y= sc.nextInt();
	   
		     System.out.print("Lcm of two number"+ lcm(x,y)); 
	   
 }
}


/*
Enter the number:
10
15
Lcm of two number30
 */
 /*
 
 class Palindrome
 {
	 public static void main(String[]args);
	 int r, sum=0,temp;
	 int n=454;
	 temp=n;
	 while(n>0)
	 {
		 r=n%10;
		 sum=(sum*10)+r;
		 n=n/10;
	 }
	 if(temp=sum)
	 {
		 System.out.print("palindrome no");
	 }
	 else
		 System.out.print("Not palindrome no");
 }
 */