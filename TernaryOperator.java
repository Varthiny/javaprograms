import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int number=sc.nextInt();
		result(number);
		
	}
	public static void result(int number) {
		System.out.println((number>=0)? "\n you have entered positive number" : "\n you have entered negative number");
	}

}
