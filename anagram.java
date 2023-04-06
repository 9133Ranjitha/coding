/*Write a program to check whether a string A is anagram of String B?
Example : Input  : String A : angel
                              String B : glean
*/
class anagram 
{
	public static void main(String[] args)
	{
		String str1 = "saravana";
		String str2 = "avaransa"; 
		
		char[] A = str1.toCharArray();
		char[] B = str2.toCharArray();
		
		if(A.length != B.length)
		{
			System.out.println("not an anagram");
		}
		 
		 else
		 {
			 int count = 0;
			for(int i = 0 ;i<A.length;i++)
			{
				for(int j = 0; j<B.length;j++)
				{
					if(A[i] == B[j] && A[i] != '!')
					{
						count +=1;
						A[i] = '!';
						B[j] = '!';
					}
					
				}
			}
			if(count == A.length)
			{
				System.out.println("is an anagram");
				
			}
			else
			{
				System.out.println("not anagram");
			}
		}
			
			
	}		
}
