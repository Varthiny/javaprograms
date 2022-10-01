//program to find leap year//

mport java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year :");
        year = sc.nextInt();
        switch(year%4) {
            case 1:
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a leap year");

                    } else
                        System.out.println(year + " is not a leap year");
                        break;
                }
        }
        }
    }