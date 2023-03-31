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
/*
Enter the number23
number is Odd


Enter the number22
number is  Even
*/