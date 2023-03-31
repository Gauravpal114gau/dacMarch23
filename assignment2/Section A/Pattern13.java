class Pattern13{
	public static void main(String args[])
	{
		int alpha=65;
		{
			for(int i=0;i<=4;i++)
			{
				for(int k=4;k>=i;k--)
				{
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++)
				{
					System.out.print((char)(alpha+i)+" ");
				}
				 System.out.println();
			}
		}
	}
}
     A
    B B
   C C C
  D D D D
 E E E E E
