public class Solution2 {
	public int maxBlock(String s) {
		/*
		* Initialise count, maxcount to 0+		 * 
		 */
		 
		 int maxcount = 0, count = 0;
		 
		 if(s.length() == 0)
			return maxcount;
		else if(s.length() == 1)
			return ++maxcount;
		maxcount++; 
		count++;
		for(int i=1; i < s.length(); i++)
		{
			if(s.charAt(i) == s.charAt(i-1))
			{
				count++;
				if(count > maxcount)
					maxcount = count;
			}
			else
				count = 1;
		}
		
		return maxcount; 
	}
	public static void main(String[] args)
	{
		Solution2 s2=new Solution2();
		String s=new String("hello");
		System.out.println(s2.maxBlock(s));
	}
}

