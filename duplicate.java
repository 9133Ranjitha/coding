//Write a program to  Count all duplicate elements present in an array?
class duplicate
{
	public static void main(String[] args)
	{
	int[] arr ={1,2,3,4,5,7,6,7,2,5};
	System.out.print(duplicateElements(arr));

	}
	
	public static int duplicateElements(int[] arr)
	{
	int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
				count++;
				}
			}
			
		}
		return count;
	
	}
}
