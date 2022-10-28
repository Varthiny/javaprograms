/*class A{
    int length=5;
}
class B{
    int breadth=6;
}
public class main1{
    static int height=7;
    public static void main(String args[]){
        A obj1=new A();
        B obj2=new B();
        System.out.println(obj1.length*obj2.breadth*height);
    }
}*/
//Single Inheritance
/*class single_base{
    int data=10;
    void printData(){
        System.out.print("parent class called");
    }

}
public class main1 extends single_base{
    public static void main(String args[]){
        int b=20;
        main1 s = new main1();
        System.out.println(s.data);
        s.printData();

    }
}*/

//Multilevel Inheritance
/*class A{
    int x=10;

}
class B extends A{
    int y=20;
}
public class main1 extends B{
    public static void main(String args[]){
        main1 obj=new main1();
        System.out.println(obj.x+obj.y);

    }
}*/

//super keyword are used to access immediate parent class variables,methods and constructors//
class paytm{
    int amount=100;
    void printReceipt(){
        System.out.println("hi");
    }
}
/*class gpay extends paytm{
    int amount=400;
    void printReceipt(){
        super.printReceipt();
        System.out.println(super.amount);
        System.out.println(amount);
    }
}
public class main1 {
    public static void main(String args[]){
        gpay obj=new gpay();
        obj.printReceipt();
    }
}*/
//constructor chaining
/*class base{
    base(){
        System.out.println("parent class constructor");
    }
}
class derived extends base{
    derived(){
        super();
        System.out.println("derived class constructor");
    }
}
public class main1 {
    public static void main(String args[]) {
        derived obj=new derived();


    }
}*/
/*class parent{
    parent(int a,int b){
        System.out.println("base value " +(a+b));

    }
}
class child extends parent{
    child(){
        super(10,20);
        System.out.println("derived class");
    }
}
public class main1{
    public static void main(String args[]){
        child obj=new child();
    }
}*/
/*class vehicle{
    final int speedlimit=800;
    void changeSpeed(){
        speedlimit=80;
    }
}
public class main1{
    public static void main(String args[]){
        vehicle obj=new vehicle();
        obj.changeSpeed();
    }
}*/
