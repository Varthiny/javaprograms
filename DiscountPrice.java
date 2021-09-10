import java.util.Scanner;
 
class DiscountPrice
{
	public static void main(String args[])
	{
 
	double  discount,amount,listedprice,s;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter listedprice ");	
               
	listedprice=sc.nextDouble();
 
        System.out.println("enter discount percentage ");	
               
	discount=sc.nextDouble();			
	
        s=100-discount;
 
	amount= (s*listedprice)/100;
 
	System.out.println("amount after discount="+amount);
 
	}
}