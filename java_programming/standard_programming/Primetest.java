class UniqueNumber
{
	public static void main(String[] args) 
	{
		int n=1234;
		int c1=n ,c2=0;
		int count=0 ,f=1;
		while(c1>0)
		{
			int d1=c1%10;
			c2=n;
			count=0;
			while(c2>0)
			{
				int d2=c2%10;
				if(d1==d2)
				{
					count++;
				}
				c2/=10;
			}
			if(count>1)
			{
				f=0;
				break;
			}
			c1/=10;
		}
		if(f==1)
			System.out.println("unique number");
		else
			System.out.println("not unique number");
		
	}
}
