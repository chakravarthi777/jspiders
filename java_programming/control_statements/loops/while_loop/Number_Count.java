class Number_Count
{
	public static void main(String[] args) 
	{
		int n=12345;
		int count=0;
		while(n!=0) //n>0
		{
			n/=10; //updation of the loop
			count++; //count+=1 , count=count+1
		}
		System.out.println(count);
	}
}
