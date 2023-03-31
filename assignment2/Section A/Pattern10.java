class Pattern10{
	public static void main(String args[])
	{
		int alpha=65;
		{
			for(int i=4;i<=0;i++)
			{
				for(int k=4;k>=i;k--)
				{
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++)
				{
					System.out.print((char)(alpha+j));
				}
				 System.out.println();
			}
		}
	}
}