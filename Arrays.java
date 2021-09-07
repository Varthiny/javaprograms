import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int []array=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elemnt");
			array[i]=sc.nextInt();
			
		}
		System.out.println("printing the elements in an array");
		for(int i=0;i<array.length;i++) {
		    System.out.println(array[i]);
	    }   
	

	}

}
