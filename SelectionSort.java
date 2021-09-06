import java.util.Random;
public class SelectionSort {
	
   public static void main(String args[]) { 
	   Random ra = new Random();
	   
	   
	   int arraySize=1000000;
	   int []numbers;
	   numbers=new int[arraySize];
	   for(int i=0; i<arraySize; i++) {
		   numbers[i]=ra.nextInt();
		   
	   }
	   System.out.println("unsorted numbers");
	   printArray(numbers);
	   
	   
	   //int []numbers= {1,9,7,4,5};
	 long startingtime= System.currentTimeMillis();
	  
	sort(numbers);
	long endingtime= System.currentTimeMillis();
	System.out.print("startingtime=");
	System.out.println(startingtime);
	System.out.print("endingtime=");
	System.out.println(endingtime);
	
	
	System.out.print("duration=");
	System.out.print(endingtime-startingtime);
	System.out.println();
	//System.out.println("sorted numbers");
	//printArray(numbers);
	   
   }
   
   public static int[] sort(int[] arr) {
	   for(int i=0; i<arr.length-1; i++) {
    	   int minIndex = i;
        
           for(int j=i+1; j<arr.length; j++) {  
               if(arr[j] < arr[minIndex]) { 
                     minIndex=j;
               }
           }
            	   
           int temp = arr[minIndex];  
           arr[minIndex] = arr[i];  
           arr[i] = temp;  
               
        } 
	        
	    return arr;
   }
   
   public static void printArray(int[] arr) {
	   for(int i=0;i<arr.length;i++) {
		   System.out.println(arr[i]);
	   }
   }
}
   
	  
        
         
       
