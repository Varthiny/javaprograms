//program to replace whitespaces//
public class WhiteSpaces {
    public static void main(String args[]){
        String sentence="Noth ing i s im possi ble";
        System.out.println("initial sentence: "+sentence);
        sentence=sentence.replaceAll("\\s","");
        System.out.println("After replacement: "+sentence);

    }
}
