
public class NumberClass {

	public static void main(String[] args) {
		Integer x = 5;
		Integer y = 10;
		Double d = 100.675;
		Float f = 90.60f;
		
		
		System.out.println(x);
		System.out.println(x.equals(y));
		System.out.println(y.floatValue());
		System.out.println(x.doubleValue());
		System.out.println(x.compareTo(4));
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(f));
		System.out.println(Math.min(x,y));
		System.out.println(Math.random());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.printf("The value of pi is %.4f%n", Math.PI);
		
		
		}
}
