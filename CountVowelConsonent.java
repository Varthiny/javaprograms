
public class CountVowelConsonent {

	public static void main(String[] args) {
		 
		int vSum =0,cSum =0;
		String str ="I Wish To Go Paris";
		str =str.toLowerCase();
		
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				vSum++;
				
		    }
			    else if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
			    	cSum++;
			    	
			    }
		}
		System.out.println("Number of vowels:" +vSum);
		System.out.println("Number of consonents:" +cSum);
		
	}
	
}


