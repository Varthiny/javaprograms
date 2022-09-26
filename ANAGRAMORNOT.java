//PROGRAM TO CHECK IF TWO STRINGS ARE ANAGRAMS OR NOT//
import java.util.Arrays;
import java.util.Scanner;
public class AnagramOrNot {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       String string1=sc.nextLine();
       String string2=sc.nextLine();
       String s1=string1.replaceAll("\\s", "");
       String s2=string2.replaceAll("\\s", "");

        boolean result;
       // String string1="keep";
       // String string2="peek";
        int length1=s1.length();
        int length2=s2.length();
        if(length1!=length2)
            result=false;
        else{
            char[] ch1=s1.toLowerCase().toCharArray();
            char[] ch2=s2.toLowerCase().toCharArray();
            int i=0;
            while(i<length1){
                int j=i+1;
                while(j<length1){
                    if(ch1[j]<ch1[i]){
                        char temp=ch1[i];
                        ch1[i]=ch1[j];
                        ch1[j]=temp;
                    }
                    j++;
                }
                i++;
            }
            char[] sortedString1=ch1;
            int l=0;
            while(l<length2){
                int m=l+1;
                while(m<length2){
                    if(ch2[m]<ch2[l]){
                        char temp=ch2[l];
                        ch2[l]=ch2[m];
                        ch2[m]=temp;
                    }
                    m++;
                }
                l++;
            }
            char[] sortedString2=ch2;
            result=Arrays.equals(sortedString1,sortedString2);
        }
       if(result)
           System.out.println("The given string is a anagram");

       else
           System.out.println("The given string is not an anagram");



    }
}