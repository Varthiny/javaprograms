//PROGRAM TO DELETE REPEATED ELEMENTS IN AN INTEGER ARRAY//
import java.util.Scanner;
public class DeleteRepeatedElements {
    public static void main(String args[]){
        int arrayLength;
        int numbers[]=new int[50];
        int tempArray[]=new int[50];
        Scanner sc=new Scanner(System.in);
        arrayLength=sc.nextInt();
        for(int i=0;i<arrayLength;i++){
            numbers[i]=sc.nextInt();
        }
        int a=0;
        while(a<arrayLength){
            int b=a+1;
            while(b<arrayLength){
                if(numbers[b]<numbers[a]){
                    int temp=numbers[a];
                    numbers[a]=numbers[b];
                    numbers[b]=temp;

                }
                b++;
            }
            a++;

        }
        int j = 0;
        for (int k = 0; k < arrayLength - 1; k++) {
            if (numbers[k] != numbers[k + 1]) {
                tempArray[j] = numbers[k];
                j++;
            }

        }
        tempArray[j] = numbers[arrayLength - 1];

       for(int k=0;k<=j;k++){
       System.out.print(tempArray[k]+" ");

        }
        //for(int k=0;k<arrayLength;k++)
        //System.out.println(tempArray[k]+"");



    }
}