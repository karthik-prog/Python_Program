/*
  1. Question -> No. of jewels in stones
      Input -> Jewel string and Stones string
	  Output ->  int no. of jewels.
  2.
    Testcase 1 -> Positive -> Input ->"aA","aAABBB"
	                          Output -> 3
	Testcase 2 -> Edge -> Input ->"z","ZZ"
	                          Output -> 0
    Testcase 3 -> Negative -> Input ->"bR","k"
	                          Output -> 0
	3. Psuedocode -> 2 pointer Algorithm
	
	  ->  left pointer on first element of jewel and right pointer on first element of stones
      ->  if left pointer element and right pointer element is equal 
             -> Increment Count variable and Increment right variable
     ->if  right in last element of stones
             -> Assign right to first element of stones
             -> Increment left pointer	
     -> if left in last element of jewels and right in last element of stones (while loop condition)
              -> break the loop	 
	                              
*/
class solution
{
	public static void main(String args[])
	{
		String jewel="aA",stones="aAABBB";
		char[] j=jewel.toCharArray();
		char[] s=stones.toCharArray();
		int left=0,right=0,count=0;
		while(true)
		{
			System.out.println(j[left]+" "+j[right]);
			if(j[left]==s[right])
			{
				count++;
				right++;
			}
			else
                right++;
			
			if(right == s.length-1)
				left++;
			
			if(left >= j.length-1 && right >= s.length-1)
				break;
			
		}
		System.out.println(count);
	}		
}