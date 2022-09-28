//program for finding a prime number//
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        int number =0;
        int count =0;
        Scanner sc = new Scanner(System.in);
        boolean done = false;
        while(!done){
            try{
                System.out.println("Enter a number:");
                number = sc.nextInt();
                done = true;

            }
            catch(InputMismatchException e){
                sc.nextLine();
                System.out.println("Invalid entry!...Enter a whole number");
            }
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                count++;
                break;

            }
        }
        if(number>1&&count==0){
            System.out.println(+number+" is a prime number");
        }

        else{
            System.out.println(+number+" is not a prime number");
    }
    }

}
