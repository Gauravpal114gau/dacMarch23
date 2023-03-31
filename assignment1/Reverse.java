

import java.util.Scanner;
class Reverse{
	public static void main(String[]args)
	{
	int m , n ,  sum=0;
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

/*
Enter the number2345
Reverse of the number5432
*/

