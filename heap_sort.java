package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;


public class heap_sort {
    
    private static int[] arr = {6,5,3,1,8,7,2,4};;
  
    private static int n;
    private static int left;
    private static int right;
    private static int largest;
    
    private static void printArray() {
        
        for(int i=0; i<=arr.length-1; i++) {
            System.out.println("a[" + i + "] = " + arr[i]);
        }
    }
    
    public static void buildheap(){
        n=arr.length-1;
        for(int i=n/2;i>=0;i--){
            maxheap(i);
        }
    }
    
    public static void maxheap(int i){ 
        left=2*i;
        right=2*i+1;
        if(left <= n && arr[left] > arr[i]){
            largest=left;
        }
        else{
            largest=i;
        }
        
        if(right <= n && arr[right] > arr[largest]){
            largest=right;
        }
        if(largest!=i){
            exchange(i,largest);
            maxheap(largest);
        }
    }
    
    public static void exchange(int i, int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t; 
        }
    
    public static void sort(){

        buildheap();
        
        for(int i=n;i>0;i--){
            exchange(0, i);
            n=n-1;
            maxheap(0);
        }
    }

    public static void main(String[] args) {
        
  
         
            
            sort();
            
            
            
            printArray();
            
      
    }
}