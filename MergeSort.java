
public class MergeSort {

	public static void merge(int arr[],int leftIndex,int middleIndex,int rightIndex) 
		{
			int n1=middleIndex-leftIndex+1;
			int n2=rightIndex-middleIndex;
			
			int leftArray[]=new int[n1];
			int rightArray[]=new int[n2];
			
			for(int i=0;i<n1;i++) {
				
				leftArray[i]=arr[leftIndex+i];
			}
			for(int j=0;j<n2;j++) {
				
				rightArray[j]=arr[middleIndex+1+j];
			}
			int i=0,j=0;
			int k=leftIndex;
			while(i<n1 && j<n2) {
				
				if(leftArray[i]<=rightArray[j]) {
					arr[k]=leftArray[i];
					i++;
				}
				else {
					arr[k]=rightArray[j];
					j++;
				}
				k++;
			    
			    }
			while(i<n1) {
				arr[k]=leftArray[i];
				i++;
				k++;
		    }
			while(j<n2) {
				arr[k]=rightArray[j];
				j++;
				k++;
			}
			
		}
		void mergeSort(int[] arr,int leftIndex,int rightIndex) {
			if(leftIndex<rightIndex) {
				int middleIndex=(rightIndex+leftIndex)/2;
				mergeSort(arr,leftIndex,middleIndex);
	       		mergeSort(arr,middleIndex+1,rightIndex);
				merge(arr,leftIndex,middleIndex,rightIndex);
				
			}
		}
		public static void main(String args[]) {
			int arr[]= {14,7,3,12,9,11,6,2};
			MergeSort ob=new MergeSort();
			ob.mergeSort(arr,0,arr.length-1);
			
			System.out.println("\nSorted array");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]+"");
			}
			
			
		}
		
	}


