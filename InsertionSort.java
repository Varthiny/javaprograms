import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] =new int[50];  
	       Scanner scan = new Scanner(System.in);  
	         
	       System.out.print("Enter Array Size : ");  
	       int size = scan.nextInt();  
	         
	       System.out.print("Enter Array Elements : ");  
	       for(int i=0; i<size; i++)  
	       {  
	           a[i] = scan.nextInt();  
	       }  
	         
	       System.out.print("Sorting Array using Insertion Sort Technique..\n");  
	       for (int i=1;i<size;i++) {
	    	   int temp=a[i];
	    	   int j=i-1;
	    	   while((j>=0 && (a[j])>temp)) {
	    		   a[j+1]=a[j];
	    		   j=j-1;
	    	   }
	    	       a[j+1]=temp;
	    	   
	       }
	       System.out.print("Now the Array after Sorting is :\n");  
	       for(int i=0; i<size; i++)  
	       {  
	           System.out.print(a[i]+ "  ");  
	       } 
		

	}

}
