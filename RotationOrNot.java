//program to check the given strings are rotation of each other//

import java.util.Scanner;
public class RotationOrNot {
    public static void main(String args[]){
        int k=0,count=0;

        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();
        String string2=sc.nextLine();
        String s1=string1.replaceAll("\\s", "");
        String s2=string2.replaceAll("\\s", "");
        boolean result=false;
        int length1=s1.length();
        int length2=s2.length();
        if(length1==length2) {

            String s3 = s1.concat(s1);
            char[] ch1 = s2.toLowerCase().toCharArray();
            char[] ch2 = s3.toLowerCase().toCharArray();

            for (int i = 0; i < s2.length() && !result; i++) {
                for (int j = k; j < s3.length(); j++) {
                    if (ch1[i] == ch2[j]) {
                        count++;
                        k = j + 1;
                        break;
                    }
                    else if(count!=0){
                        result = true;
                        break;
                    }

                }

            }
        }


        if(count==s2.length())
            System.out.println("the given string is a rotation of each other");
        else
            System.out.println("the given string is not a rotation of each other");




    }
}
