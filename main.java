mport java.util.Scanner;

public class main {
    public static void main(String args[]){
        //automatic casting int to double
        /*int myInt=9;
        double myDouble=myInt;
        System.out.println(myInt);
        System.out.println(myDouble);*/
        //manual casting double to int
       /* double myDouble=9.78;
        int myInt=(int)myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);*/
        //declare variables
        /*int a=12,b=5;
        //add operator
        System.out.println("a+b=" +(a+b));
        //sub operator
        System.out.println("a-b=" +(a-b));
        //mul operator
        System.out.println("a*b=" +(a*b));
        //div operator
        System.out.println("a/b=" +(a/b));
        //modulo operator
        System.out.println("a%b=" +(a%b));*/
        /*int a=9;
        int var;
        var=a;
        System.out.println("var using =:" +var);
        var +=a;
        System.out.println("var using +=:" +var);
        var *=a;
        System.out.println("var using *=:" +var);*/
       /* Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

            System.out.println(a==b);

            System.out.println(a!=b);

            System.out.println(a>b);

            System.out.println(a<b);

            System.out.println(a<=b);

            System.out.println(a>=b);*/

        //increment and decrement operators

        /*int a=12, b=12;
        int res1,res2;
        System.out.println(a);
        res1=++a;
        System.out.println(res1);
        res2=--b;
        System.out.println(res2);*/

        //ternary operator

        /*int feb=29;
        String res;
        res=(feb==28)?"not a leap year": "leap year";
        System.out.println(res);*/
        int choice;
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        switch(choice){
            case 1:
                Scanner sc1=new Scanner(System.in);
                int a=sc1.nextInt();
                int b=sc1.nextInt();
                System.out.println(a+b);
                break;
            default:
                System.out.println("null");
                break;


        }












    }
}
