class UniqueNumberBySir 
{
	public static void main(String[] args) 
	{
		int n=12345;
		boolean isUnique=true;
		while(n>0)
		{
			int ld=n%10;		//1. ld=5 | 2. ld=4 | 3. ld=3 | 4. ld=2
			n/=10;				
			int t=n;			//1. t=1234 | 2. t=123 | 3. t=12 | 4.
			while(t>0)
			{
				int d=t%10;		//1. d=4	| 2. d=3  |3. d=2
				if(d==ld)		//d=4 ld=5 not same | 2. d=3 ld=4 not same| 3. d=2 ld=3
				{
					isUnique=false;	//1.false | 2. flase | 3. false
					break;
				}
				t/=10;			//1.t=123 | 2. t=12 |3. t=1
			}
		}
		if(isUnique)
			System.out.println("unique number");
		else
			System.out.println("not unique number");
	}
}
