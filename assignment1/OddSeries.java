
  import java.util.Scanner; 
  class OddSeries 
  { 
     public static void main(String args[]) 
   { 
      Scanner sc = new Scanner (System.in); 
	  System.out.print(" Enter the number :");
       int n = sc.nextInt(); 
       for(int i=1;i<=n;i+=2) 
   {
    System.out.print(i+" ");
   }	
   }
  }
  
/*  
  15
1 3 5 7 9 11 13 15
*/