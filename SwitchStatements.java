import java.util.Scanner;
public class SwitchStatements {
	public static int positive(int number) {
		if(number>0) {
			return 1;
		}
		else if(number<0) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//while(true) {
	    System.out.println("\nEnter the number:");
		int number=sc.nextInt();
		int result=positive(number);
		
		switch(result) {
		case 0:
			System.out.println(number+" is negative");
			break;
			
		case 1:
			System.out.println(number+" is positive");
			break;
			
		default:
			System.out.println("the given number is zero");
		}
		//System.out.print("Do you want to check for other number (Y->yes / N ->No): ");
		//String ch = sc.next();
		//if(ch.toLowerCase() == "N" || ch.toLowerCase() == "no"){
			//break;
		//}
		
		
			
		
			
		
			
		}
	}

//}
