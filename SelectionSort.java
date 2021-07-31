  
  
public class SelectionSort {
	
   public static void main(String args[]) { 
	   int []numbers= {10,5,3,7,2};
	   
	   sort(numbers);
	   printArray(numbers);
	   
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
   
	  
        
         
       