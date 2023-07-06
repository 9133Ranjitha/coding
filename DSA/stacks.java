/*class stack
{
public static void main(String[] args)
{
int[] arr = {1,3,5,7,6,3};
int target=34;

String store = "";
for(int i = 0; i < arr.length; i++)
{
for(int j = i+1; j <arr.length; j++)
{
if(Math.pow(arr[i],2)+Math.pow(arr[j],2) == target)
{

store=arr[i]+" + "+arr[j]+" = "+target;


}else{

break;


}



}



}
System.out.print(store);



}

}*/
////////////////////////////////////////////////////
/*class stack
{
public static void main(String[] args)
{
int[] arr = {1,3,5,7,6,3};
System.out.print(squire(arr,34));


}
public static String squire(int arr[],int target)
{

String store = "";
for(int i = 0; i < arr.length; i++)
{
for(int j = i+1; j <arr.length; j++)
{
if(Math.pow(arr[i],2)+Math.pow(arr[j],2) == target)
{

store=arr[i]+" + "+arr[j]+" = "+target;

}
break;

}



}
return store;



}

}*/

///////////////////////////////////////////////
class squire
{
	public static void main(String[] args)
	{
	int[] arr = {2,3,4,6,8,9};
	int target = 85;
	int startPoint = 0;
	int endPoint = arr.length-1;


		while(startPoint < endPoint)
		{
		int sum = arr[startPoint] * arr[startPoint]+arr[endPoint]*arr[endPoint];
        //System.out.println(sum);
			if(sum == target)
			{
				System.out.println(arr[startPoint] +"+"+arr[endPoint]+"="+target);
				break;

			}else if(sum < target){
				startPoint++;
			}else{
				endPoint--;
			}

		}

	}
}
