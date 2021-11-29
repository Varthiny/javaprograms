
public class StringClass {

	public static void main(String[] args) {
		String s = "My name is Varthiny";
		System.out.println(s);
		System.out.println(s.charAt(6));
		System.out.println();
		String str1= "Bloom";
		String str2 = new String("bloom");
		String str3 = new String("With Kindness");
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str3));
		System.out.println("");
		String str4 = new String("Bloom");
        String str5 = new String("Bloom");
		System.out.println(str1.contentEquals (str2));
		System.out.println(str5.contentEquals(str4));
		System.out.println("");
		
		String s1 = "Hi";
		System.out.println(s1.concat(" vishnu"));
		System.out.println("");
		
		char[] list1 = {'h','a','p','p','y'};
		String list2 = "";
		System.out.println(list2.copyValueOf(list1));
		System.out.println(list2.copyValueOf(list1, 1, 4));
		
		System.out.println(str1.endsWith("ng"));
		System.out.println(s.length());
		System.out.println(str1.replace('B','G'));
		System.out.println("");
		
		String Str = new String("Believe in your own magic");
		String SubStr1 = new String("magic");
		System.out.println("Found Index:" + Str.indexOf( SubStr1 ));
		
		float floatVar = 10.02f;
		int intVar = 20;
		String stringVar = "vishnu";
		
		String fs; 
		
		fs = String.format ("Float Value = " +"%.5f, Int Value =" +" %d, and the string" + " is %s", floatVar, intVar, stringVar);
		System.out.println(fs) ;
		
		// creates empty builder, capacity 16
		StringBuilder sb = new StringBuilder();
		// adds 9 character string at beginning
		System.out.println(sb.append("Greetings"));
		System.out.println(list1.length);

  
		
		}

		

	}


