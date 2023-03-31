 
 
 
  public class Palindrome
 {
	 public static void main(String[]args)
	 {
	 int r, sum=0, temp;
	 int n=454;
	   temp=n;
	    
	 while(n>0)
	 {
		 r=n%10;
		 sum=(sum*10)+r;
		 n=n/10;
	 }
	 if(temp==sum)
	 {
		 System.out.print("palindrome no.");
	 }
	 else
		 System.out.print("Not palindrome no.");
	  }
 }
 /*
 palindrome no.
 */
 /* 
 
 import java.util.Scanner;
 class Prime{
	 
	 public static void main(String[]args);
	 {
		 int n;
		  Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number");
		   n=sc.nextInt();
		   for(int i=2;i<n;i++)
		   {
			   while(n%i==0)
			   {
				   System.out.println( i+"Enter the number"); 
				   n=n/i;
			   }
		   }
		   if(n>2)
		   {
			    System.out.println(n);
		   }
	 }
 }
 */