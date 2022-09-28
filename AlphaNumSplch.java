//program to find character alphabet,number and special character//
import java.util.Scanner;

public class AlphaNumSplch {
    public static void main(String args[]){
        String str;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        str = sc.nextLine();
        for(int i = 0; i<str.length();i++){
            ch = str.toLowerCase().charAt(i);
            if(ch >= 'a' && ch<= 'z' ){
                System.out.println("Entered input " +ch+ " is a alphabet");
            }
            else if(ch >= '0' && ch <='9'){
                System.out.println("Entered input " +ch+ " is a number");
            }
            else{
                System.out.println("Entered input " +ch+ " is a special character");
            }

        }

    }
}