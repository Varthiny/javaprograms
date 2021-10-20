
/*class BreakDemo1 {
    public static void main(String[] args) {

        int[] arrayOfInts = 
            { 32, 87, 12, 589,
              12, 12, 1076, 2000,
              8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }
       
        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}*/

public class BreakDemo1 {
	public static void main(String[] args) {
		int[] arrayOfInts = {32, 87, 3, 589, 12, 1076,
                2000, 8, 622, 127, 12};
		int searchfor = 12;
		
		BreakDemo1.getIndexInArray(arrayOfInts,searchfor);
	}
	public static void getIndexInArray(int[] arrayOfInts,int searchfor) {
		int[] input = arrayOfInts;
		int arrayElement = searchfor;
		
		
		for (int i = 0; i < input.length; i++) {
			if(input[i] == arrayElement) {
				System.out.println("Found " + searchfor + " at index " + i );
				
			}
		}
	}
}
