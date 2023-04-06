//Write a program to calculate a product of all even numbers present in an array?
class product
{
	public static void main(String[] args)
	{
	int [] arr={1,2,3,4,5,6,7,8,9,10};
	
	
	System.out.println(productEvenNumbers(arr));
	}
	
	public static int productEvenNumbers(int[] arr)
	{
	int product = 1;
		for(int i = 0; i < arr.length; i++)
		{   
			if(arr[i] % 2 == 0)
			{
				product*=arr[i];
			}

		}
		return product;
	}
	
}
