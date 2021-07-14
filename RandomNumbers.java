import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
	Random ra = new Random();
	
	int i =ra.nextInt(60);
	int j =ra.nextInt(500);
	
	System.out.println("Randomly generated integer values :");
	System.out.println(i);
	System.out.println(j);
	
	double c =ra.nextDouble();
	double d =ra.nextDouble();
	
	System.out.println("Randomly generated double values :");
	System.out.println(c);
	System.out.println(d);
	
	float m =ra.nextFloat();
	float n =ra.nextFloat();
	
	System.out.println("Randomly generated float values :");
	System.out.println(m);
	System.out.println(n);
	
	long o =ra.nextLong();
	long p =ra.nextLong();
	
	System.out.println("Randomly generated long values :");
	System.out.println(o);
	System.out.println(p);
	
	}
	
}
	
	
	
	
	
	
		
		
		
		
	
	
