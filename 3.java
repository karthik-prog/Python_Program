class solution
{
	public static void main(String args[])
	{
		int sum=0,current=0,f=0;
		int len=7;
		int arr[]={1,2,3,2,5,1,7};
		current=arr[0];
		while(i<len)
		{
			if(sum<current)
			{
				i++;
				current+=arr[i];
			}
			if(sum>current)
			{
				current-=arr[f];
				f++;
			}
		}
	}
}