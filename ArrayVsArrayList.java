import java.util.Arrays;
import java.util.ArrayList;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		String[] nameArray = {"siva","vishnu","alamu"};
		ArrayList<String>nameArrayList = new ArrayList<>(Arrays.asList("siva","vishnu","alamu"));
		
		//get element
		System.out.println(nameArray[0]);
		System.out.println(nameArrayList.get(0));
		
		//get size
		System.out.println(nameArray.length);
		System.out.println(nameArrayList.size());
		
		//add an element
		nameArrayList.add("raman");
		System.out.println(nameArrayList.get(3));
		
		//set an element
		nameArray[0] = "preetha";
		System.out.println(nameArray[0]);
		nameArrayList.set(0, "preetha");
		System.out.println(nameArrayList.get(0));
		
		//remove an element
		nameArrayList.remove("siva");
		System.out.println(nameArrayList.get(0));
		
		//print
		System.out.println(nameArray);
		System.out.println(nameArrayList);
		

	}

}
