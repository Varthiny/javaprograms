import java.util.Scanner;
 
public class DiscountPrice {

	public static void main(String args[]) {
	
	double  listedPrice,discountPercentage,finalAmount,percentageToNumber;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter listedprice");	
               
	listedPrice=sc.nextDouble();
 
        System.out.println("Enter discount percentage ");	
               
	discountPercentage=sc.nextDouble();			
	
        percentageToNumber=100-discountPercentage;
 
	finalAmount= (percentageToNumber*listedPrice)/100; 
 
	System.out.println("Amount after discount="+finalAmount);
 
	}
}
