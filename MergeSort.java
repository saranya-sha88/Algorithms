package sorting;

public class MergeSort {

	public static void main(String[] args) {
		
		int i;
		//int[] input = {3,1,4,7,8,5,6,2};
		int[] input = {2,7,4,1,5,3};
		//Integer[] in = {1,2,3,4,5};
		mergeSort(input,0,input.length-1);
		
		for(i=0;i<input.length;i++)
			System.out.println("sorted list "+input[i]);

	}
	
	public static void mergeSort(int[] A,int left,int right)
	{
		if(left < right)
		{
			int mid = ((right+left)/2);
			mergeSort(A,left,mid);
			mergeSort(A,mid+1,right);
			merge(A,left,mid,right);
		}
		
	}
	
	private static void merge(int[] A,int left,int mid, int right)
	{
		int n = right-left+1;
		int k = mid+1;
		int j = left;
		int i;
		int[] temp = new int[n];
		
		for(i=0;i<n;i++)
		{
			if(j > mid)
			{
				temp[i] = A[k++];
			}else if(k > right)
			{
				temp[i] = A[j++];
			}else if( A[j] < A[k] )
			{
				temp[i] = A[j];
				j++;
			}else{
				temp[i] = A[k];
				k++;
			}
		}
		
		for(i=0;i<n;i++)
		{
			A[left+i] = temp[i];
		}
	}

}
