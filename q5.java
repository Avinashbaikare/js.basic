import java.util.*;
public class q5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String p="";
		String q="";
		char t=' ';
		char t1=' ';
		boolean ans=false;
		boolean flag=false;
		boolean flag1=false;
		System.out.println("enter two string ");
		String a=sc.nextLine();
		String b=sc.nextLine();
		if(a.length()==b.length())
			{
				ans=true;
			
		
			for(int i=0;i<a.length()-1;i++)
		{
				
				if(a.charAt(i)==a.charAt(i+1))
				{
					 flag=true;
				}
				else
				{
					flag=false;
				}
				
				if(b.charAt(i)==b.charAt(i+1))
				{
					 flag1=true;
				}
				else
				{
					flag1=false;
				}
			if(flag==flag1)
			{
			ans=true;
			}
			else
			{
			ans=false;
			}
				

		}
		}
			else
			{
			ans=false;
			
			}
		
			
		
		
		if(ans)
		{
		System.out.println("true");
		}
		else
		{
		System.out.println("false");
		}
		
			
	}
}