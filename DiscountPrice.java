import java.util.Scanner;
 
public class DiscountPrice {

public static void main(String args[]) {
	
  double  listedPrice,discountPercentage,percentageToRupees;
	
Scanner sc=new Scanner(System.in);
	
System.out.println("Enter listedprice");	
               
    listedPrice=sc.nextDouble();
 
System.out.println("Enter discount percentage ");	
               
    discountPercentage=sc.nextDouble();			
	
percentageToRupees= (listedPrice*discountPercentage)/100; 
 
System.out.print("Amount after discount=");
System.out.print(listedPrice-percentageToRupees);
	
 
	}
}
