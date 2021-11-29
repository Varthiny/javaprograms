
public class CharacterClass {

	public static void main(String[] args) {
		System.out.println ("b1 = " + Character.isLetter('c'));
		System.out.println (Character.isLetter('5'));
		System.out.println (Character.isDigit('5'));
		System.out.println (Character.isLowerCase ('c'));
		System.out.println (Character.isLowerCase ('C')) ;
		System.out.println (Character.isUpperCase ('I'));
		System.out.println (Character.toUpperCase('m'));
		
		
		String str = Character.toString('A');
		System.out.println (str);
		
		System.out.println("She said \"Hello!\" to me.");


	}

}
