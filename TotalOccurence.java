//program for total occurance//
mport java.util.Scanner;

public class TotalOccurence1 {
    public static void main(String args[]) {
        String inputString;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        inputString = sc.nextLine();
        int lenOfInputStr = inputString.length();
        char ch = 0;
        for (int i = 0; i < lenOfInputStr ; i++) {
            if(inputString.charAt(i) != ' ') {
                for (int j = 0; j < lenOfInputStr; j++) {
                    if (inputString.charAt(i) == inputString.charAt(j)) {
                        count++;
                        ch = inputString.charAt(j);
                    }

                }
                System.out.println("The character " + ch + " occured " + count + " times");
                count=0;
            }

        }
    }
}