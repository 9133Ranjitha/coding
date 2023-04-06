/*Write a program to calculate the sum of digits present in a number?
Example : input : 124, output : 7
*/
class sumDigit
{
	public  static void main(String[] args)
	{
	
	int number = 53;
	String str = number+"";
	//System.out.println(str);
	//System.out.println(((Object)str).getClass().getSimpleName());
	System.out.println(sumDigit(str));
	}
	
	public static int sumDigit(String str)
	{
	int sum = 0;
		for(int i = 0; i < str.length(); i++)
		{
		// convert a character representing a digit in a string into its corresponding numeric value. 
		sum+=str.charAt(i)-'0';	
		}
		return sum;
	}
}

