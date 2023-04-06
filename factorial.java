//Write a program to calculate a factorial of a number?
//Example :  Input : 5
//Output : 120

class factorial
{
	public static void main(String[] args)
	{
	int number = 5;
	//System.out.println(number);
	System.out.println(factorial(number));
	}
	public static int factorial(int number)
	{
	int factor = 1;
		for(int i =1 ; i<= number; i++)
		{
		factor*=i;
	 	}
	 	return factor;
	}

}

