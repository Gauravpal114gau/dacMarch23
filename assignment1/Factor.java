 
   import java.util.Scanner;
   class Factor{
	   
   public static void main(String[] args)
   {
		 
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number");
		  int input=sc.nextInt();
	     System.out.println("Factor="+input+" are");
		 {
			 for(int i=1;i<=input;i++)
			 {
				 if(input%i==0)
				 {
					 System.out.println(i+" ");
				 }
			 }
		 }
   }
 }
 
 /*
 
 Enter the number
10
Factor=10 are
1
2
5
10

 */
 
 
 
/*
 
 import java.util.Scanner;
 class Sum{
	   public static void main(String[] args)
	   {
		   int m, n, sum=0;
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