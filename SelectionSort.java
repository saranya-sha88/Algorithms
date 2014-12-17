package sorting;

public class SelectionSort {
	
	
	public static void main(String args[])
	{
		int i;
		int[] input = {2,7,4,1,5,3};
		//Integer[] in = {1,2,3,4,5};
		sort(input);
		
		for(i=0;i<input.length;i++)
			System.out.println("sorted list "+input[i]);
	}
	
	
	public static int[] sort(int[] input)
	{
		int i,j,m,temp;
		
		for(i=0;i<=input.length - 1;i++)
		{
			m=i;
			for(j=i;j<=input.length-1;j++)
			{
				if(input[j]<input[m])
					m = j;
			}
			
			temp = input[i];
			input[i] = input[m];
			input[m]=temp;
		}
		
		return input;
	}

}
