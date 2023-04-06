class binary
{
	public static void main(String[] args)
	{
		int number = 4; 
		
                String binary = ""; 

		while(number > 0)
	        {
		    int remainder = number % 2; 
		    binary += remainder; 
		    number /=2; 
		}

		 System.out.print(binary);
		  
	}
}
