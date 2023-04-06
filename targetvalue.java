/*Write a program to check to print indices of two numbers present in an array, whose sum is equal to target value ?
             Example : input  : Array = [2,3,4,6,8,1];     Target : 10
                                          Output = 2,3
*/
class targetValue
{
	public static void main(String[] args)
	{
	int[] arr ={2,3,4,6,8,1};
	int target = 10;
	
		String result ="";
		for(int i = 1; i < arr.length-1; i++)
		{ 
			for(int j = i; j < arr.length-1; j++)
			{
				if(arr[i]+arr[j] == target)
				{
				result+=i+","+j+"="+target;
				
				}
			}

		}
		System.out.println(result);

	}

}
