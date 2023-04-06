//Write a program to check whether a string is palindrome or not?
class palindrome
{
	public static void main(String[] args)
	{
	String str="gokul";
	System.out.println(palindrome(str));
	}
	public static boolean palindrome(String str)
	{
	int startPoint=0;
	int endPoint=str.length()-1;
		while(endPoint > startPoint)
		{
			if(str.charAt(endPoint) == str.charAt(startPoint))
			{
			endPoint--;

			return true;
			}
			break;
		}
		return false;
				
	}
}
