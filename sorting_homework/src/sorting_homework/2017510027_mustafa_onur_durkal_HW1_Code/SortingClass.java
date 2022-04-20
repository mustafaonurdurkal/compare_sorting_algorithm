package sorting_homework;

import java.util.Random;

public class SortingClass {
	
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	

	public static void main(String[] args) {
		
		 //Define Array Equal Integer
		   
		   int [] equal_min_arr= new int [1000] ;
	        for(int i=0; i<1000; i++) {
	        	equal_min_arr[i]=1;
	        }
	        
	        int [] equal_med_arr= new int [10000] ;
	        for(int i=0; i<10000; i++) {
	        	equal_med_arr[i]=1;
	        }
	        
	        int [] equal_max_arr= new int [100000] ;
	        for(int i=0; i<100000; i++) {
	        	equal_max_arr[i]=1;
	        }
	        
	      //Define Array Random Integer
	        
	        Random random=new Random();
	        int [] random_min_arr= new int [1000] ;
	        for(int i=0; i<1000; i++) {
	        	random_min_arr[i]=random.nextInt(1000);
	        }
	        
	        int [] random_med_arr= new int [10000] ;
	        for(int i=0; i<10000; i++) {
	        	random_med_arr[i]=random.nextInt(1000);
	        }
	        
	        int [] random_max_arr= new int [100000] ;
	        for(int i=0; i<100000; i++) {
	        	random_max_arr[i]=random.nextInt(1000);
	        }
	        
	        //Define Array Increasing Integer
	        int [] increase_min_arr= new int [1000] ;
	        for(int i=0; i<1000; i++) {
	        	increase_min_arr[i]=i;
	        }
	        
	        int [] increase_med_arr= new int [10000] ;
	        for(int i=0; i<10000; i++) {
	        	increase_med_arr[i]=i;
	        }
	        int [] increase_max_arr= new int [100000] ;
	        for(int i=0; i<100000; i++) {
	        	increase_max_arr[i]=i;
	        }
	        
	        //Define Array Decreasing Integer
	        
	        int k =0;
	        int [] decrease_min_arr= new int [1000] ;
	        for(int i=1000; i>0; i--) {
	        	decrease_min_arr[k]=i;
	        	k++;
	        }
	        
	        k =0;
	        int [] decrease_med_arr= new int [10000] ;
	        for(int i=10000; i>0; i--) {
	        	decrease_med_arr[k]=i;
	        	k++;
	        }
	        
	        k =0;
	        int [] decrease_max_arr= new int [100000] ;
	        for(int i=100000; i>0; i--) {
	        	decrease_max_arr[k]=i;
	        	k++;
	        }
	        
	        
	        
	     //HeapSort
	        /*HeapSort heap = new HeapSort();
	        long startTime = System.nanoTime(); 
	        heap.heapSort(decrease_max_arr);
            long estimatedTime = System.nanoTime() - startTime;*/
            
           //ShellSort
            /*ShellSort shell = new ShellSort();
            long startTime = System.nanoTime();
            shell.sort(decrease_max_arr);
            long estimatedTime = System.nanoTime() - startTime;*/
	        
	        //IntroSort
	        long startTime = System.nanoTime();
	        Introsort.sort(decrease_min_arr);
	        long estimatedTime = System.nanoTime() - startTime;
	 
	      //Print the Array
	        System.out.println("Sorted array is");
	        printArray(decrease_min_arr);
	        System.out.println(estimatedTime);
	}

}
