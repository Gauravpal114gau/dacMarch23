class ProgPattern_1{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++){
			for(int k=8;k>=i;k--){
				System.out.print(" ");
			}
		
		
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+ " ");
			}
			 System.out.println();
		}
	}
}



/*
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9
*/
 
 
 class ProgPattern_2{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++){
			for(int k=8;k>=i;k--){
				System.out.print(" ");
			}
		
		
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			 System.out.println();
		}
	}
}


/*
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
*/




 class ProgPattern_3{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++){
			for(int k=8;k>=i;k--){
				System.out.print(" ");
			}
		
		
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			 System.out.println();
		}
	}
}


/*
        *
       * *
      * * *
     * * * *
    * * * * *
   * * * * * *
  * * * * * * *
 * * * * * * * *
* * * * * * * * *
*/



class ProgPattern_6{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--){
			for(int k=8;k>=i;k--){
				System.out.print(" ");
			}
		
		
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			 System.out.println();
		}
	}
}

/*

* * * * * * * * *
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
*/

class ProgPattern_7{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--){
			for(int k=8;k>=i;k--){
				System.out.print(" ");
			}
		
		
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			 System.out.println();
		}
	}
}

/*


9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1
*/