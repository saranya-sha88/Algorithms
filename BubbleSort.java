package sorting;

public class BubbleSort {
	
	public static void main(String args[])
	{
		int i;
		int[] input = {2,7,4,1,5,3};
		int[] in = {32, 51, 27, 85, 66, 23, 13, 57};
		sort(in);
		
		for(i=0;i<in.length;i++)
			System.out.println("sorted list "+in[i]);
	}
	
	public static void sort(int[] input)
	{
		int k,i,n,temp;
		boolean flag = false;
		n= input.length;
		
		for(k=1;k<=n-1;k++)
		{
			flag = false;
			for(i=0;i<n-k;i++)
			{
				if(input[i] > input[i+1])
				{
					temp = input[i];
					input[i] = input[i+1];
					input[i+1] = temp;
					flag = true;
				}
			}
			
			if(!flag)
			{
				break;
			}
		}
	}

}
