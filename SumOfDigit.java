
import java.util.*;
class SumOfDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n:");
       int n = sc.nextInt();
        for(int i=0;i<n;i++){
        	System.out.println("enter the number:");
            int a = sc.nextInt();
            int sum = 0 ;
            while(a>0){
            int temp = a%10;
            sum +=temp;
            a/=10;
            }
            System.out.println("sum of digit:"+sum);
        }
    }
}



