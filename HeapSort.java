package sorting;

public class HeapSort {
	
	private static int[] array = {14,16,9,10,8,1,4,2,3,7};
	
	private static int n;
	
	
	
	
	public static void main(String args[])
	{

		int i =0;
		
		HeapSort hs = new HeapSort();
		hs.heapSort();
		
		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}
	
	public void heapify()
	{
		int i;
		
		n = array.length -1;
		
		for(i=n/2;i>=0;i--)
		{
			maxHeap(i);
		}
		
	}
	
	public void heapSort()
	{
		int i;
		heapify();
		 
		for(i=n; i>0;i--){
			swap(0,i);
			n = n-1;
			maxHeap(0);
			
		}
	}
	
	public void maxHeap( int index)
	{
		int l = 2*(index);
		
		int r = l+1;
		
		int largest ;
		
		if(l <= (n) && array[l] > array[index])
		{
			largest = l;
		}else{
			largest = index;
		}
		
		if(r <= (n) && array[r] > array[largest])
		{
			largest = r;
		}
		
		if(index != largest)
		{
			swap(index,largest);
			maxHeap(largest);
		}
		
	}
	
	private void swap(int index,int largest)
	{
		int temp;
		
		temp = array[index];
		array[index] = array[largest];
		array[largest] = temp;
	}
	

}
