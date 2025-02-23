public class q1
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(i+j>=6&&j-i<=4&&j-i==4||j+i==6)
				{
				System.out.print(1);
				}
				else
				{
				System.out.print(" ");
				}
				if(i+j==7&&j<=4)
				{
				System.out.print(i-1);
				}
				if(j-i==1&&j>=4&&i>3)
				{
				System.out.print(i-1);
				}
				if(j==4&&i==5)
				{
					System.out.print(i+1);
				}
			}
		System.out.println();
		}
	}
}