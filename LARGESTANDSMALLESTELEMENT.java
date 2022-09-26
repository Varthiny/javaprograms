//FIND THE LARGEST AND SMALLEST ELEMENT OF AN ARRAY WHICH IS NOT SORTED//
import java.util.Scanner;

public class LargestAndSmallestElement {
    public static void main(String args[]){
        int arrayLength;
        int numbers[]=new int[50];
        Scanner sc=new Scanner(System.in);
        arrayLength=sc.nextInt();
        for(int i=0;i<arrayLength;i++){
            numbers[i]=sc.nextInt();
        }
        int smallest=numbers[0];
        for(int i=1;i<arrayLength;i++){
            int temp=numbers[i];
            if(temp<smallest)
                smallest=temp;
        }
        int largest=numbers[0];
        for(int i=1;i<arrayLength;i++) {
            int temp = numbers[i];
            if (temp > largest)
                largest = temp;
        }

        System.out.println("smallest element: " + smallest);
        System.out.println("largest element: " + largest);
    }
        }