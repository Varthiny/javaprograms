import java.util.Arrays;
import java.util.Scanner;
public class ASCII {
    public static int getFrequency(int[] arr,int data){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == data){
                count+=1;
            }
        }
        return count;
    }
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        char[] chars=sc.next().toCharArray();
        int[] asciiarray = new int[chars.length];
        for(int i=0;i<chars.length;i++) {
            asciiarray[i] = chars[i];
        }
        Arrays.sort(asciiarray);

        for(int i=0;i<getFrequency(asciiarray,asciiarray[asciiarray.length-1]);i++){
            System.out.println((char)asciiarray[0]);

        }
        }
    }

