package sorting;

public class InsertionSort {

	public static void main(String args[])
	{
		int i;
		//int[] input = {2,7,4,1,5,3};
		int[] input = {3,1,4,7,8,5,6,2};
		//Integer[] in = {1,2,3,4,5};
		sort(input);
		
		for(i=0;i<input.length;i++)
			System.out.println("sorted list "+input[i]);
	}
	
	public static int[] sort(int[] input)
	{
		int k,n,hole,value;
		
		n= input.length;
		
		for(k=1;k<=n-1;k++)
		{
			value = input[k];
			hole = k;
			
			while(hole > 0 && value < input[hole-1])
			{
				input[hole] = input[hole-1];
				hole--;
			}
			input[hole] = value;
		}
		
		return input;
	}

}
