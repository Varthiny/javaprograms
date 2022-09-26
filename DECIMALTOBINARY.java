//PROGRAM TO CONVERT DECIMAL TO BINARY NUMBER//

import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String args[]){
        int number;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        int array[]=new int[100];
        if(number==0)
            System.out.println("0");
        else{
            int i=99;
            while(number!=0){
                int y=number%2;
                array[i]=y;
                i--;
                number=number/2;

            }
            for(int j=i+1;j<100;j++)
                System.out.print(array[j]);
        }
    }
}
