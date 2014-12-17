/**
 * 
 */
package sorting;

/**
 * @author Saranya
 *
 */
public class PancakeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int[] input={23,10,20,11,12,6,7};
		PancakeSort pancakeSort = new PancakeSort();
		pancakeSort.pancakeSort(input);
		for(i=0;i<input.length;i++)
			System.out.println(input[i]);

	}
	
	public void pancakeSort(int[] input)
	{
		int n = input.length;
		int max;
		int i;
		
		for(i = n-1; i >= 0;i--)
		{
			max = maxInt(input,i);
			flipArray(input,0,max);
			flipArray(input,0,i);
		}
	}
	
	private void flipArray(int[] input,int start,int end)
	{
		int temp;
		
		while(start < end)
		{
			temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			start++;
			end--;
		}
	}
	
	private int maxInt(int[] input,int size)
	{
		int i=0, max =0;
		
		for(i=0;i<=size;i++)
		{
			if(input[i] > input[max])
			{
				max = i;
			}
		}
		return max;
	}

}
