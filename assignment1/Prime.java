
 
 import java.util.Scanner;
 class Prime{
	 
	 public static void main(String[]args)
	 {
		 int n;
		  Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number");
		   n=sc.nextInt();
		   for(int i=2;i<n;i++)
		   {
			   while(n%i==0)
			   {
				   System.out.println( "Prime factor" +i); 
				   n=n/i;
			   }
		   }
		   if(n>2)
		   {
			    System.out.println(n);
		   }
	 }
 }
 
 
 /*
 Enter the number
34
Prime factor2
17
*/


