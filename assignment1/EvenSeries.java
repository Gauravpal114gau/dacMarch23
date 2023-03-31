 
  import java.util.Scanner; 
  class EvenSeries 
  { 
     public static void main(String args[]) 
   { 
  Scanner sc = new Scanner (System.in); 
   int n = sc.nextInt(); 
   for(int i=2;i<=n;i+=2) 
   {
    System.out.print(i +" ");
   }	
   }
  
  /*
  
  12
2 4 6 8 10 12
*/