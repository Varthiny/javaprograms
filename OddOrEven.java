//program for odd or even//
import java.util.Scanner;
public class OddOrEven {
    public static void main(String args[]) {
        String str;
        char ch;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (ch % 2 == 0) {
                System.out.println("Entered input " + ch + " is a even number");
            }
            else if(ch % 2 != 0){
                System.out.println("Entered input " + ch + " is a odd number");
            }
            else if(ch >= 'a' && ch <='z' || ch >='A' && ch<='Z'){
                System.out.println("Entered input " + ch + " is not a number\npls enter only numbers");
            }
            else{
                System.out.println("Entered input " + ch + " is a special character\nenter an integer");
            }

        }
    }
}
