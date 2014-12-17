/**
 * 
 */
package sorting;

/**
 * @author Saranya
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i;
		//int[] input = {3,1,4,7,8,5,6,2};
		int[] input = {1,2,3,4,5,6};
		//Integer[] in = {1,2,3,4,5};
		
		quickSort(input,0,input.length-1);
		
		for(i=0;i<input.length;i++)
			System.out.println("sorted list "+input[i]);

	}
	
	public static void quickSort(int[] array,int left,int right)
	{
		int pivot;
		
		if(left < right)
		{
		   pivot = 	partition(array,left,right);
		   quickSort(array,left,pivot-1);
		   quickSort(array,pivot,right);
		}
	}
	
	private static int partition(int[] array,int left,int right)
	{
		int i,j;
		
		j=left;
		for(i=left;i<right;i++)
		{
			if(array[i] < array[right])
			{
				swap(array,i,j);
				j++;
			}
		
		}
		
		swap(array,j,right);
		
		//System.out.println("j value  "+j);
		
		return j;
	}
	
	private static void swap(int[] array,int i,int j)
	{
		int temp;
		
		temp = array[j];
		array[j] = array[i];
		array[i]=temp;
	}

}
