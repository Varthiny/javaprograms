//program to find no.of words in a string//
import java.util.Scanner;
public class NumOfWords {
    public static void main(String args[]){
        String inputString;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        inputString = sc.nextLine();
        int lenOfInputStr = inputString.length();
        String str = inputString.toLowerCase();
        int i = 0;
        while(i<lenOfInputStr) {
            if (i>0 && str.charAt(i) != ' ' && str.charAt(i-1) == ' ' || str.charAt(i) != ' ' && i==0) {
                count++;
            }
            i++;
        }

        System.out.println("No.of words in a given string: "+count);
    }
}
