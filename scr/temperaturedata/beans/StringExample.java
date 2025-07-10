
import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String firstName = "Rishika";
        // String lastName = new String ("Vishnu");
        String shortName = "Rishi";
        String buddyName = new String ("Rishika");
        System.out.println(firstName == shortName);
        // System.out.println(firtName == bubbyName);
        // String fullName = firstName+""+lastName;
        // String finalName = firstName.concat(lastName);
    //     System.out.println(finalName.toUpperCase());
        String sentance = "This is program shows how can we split a string into multiple string.We need to find sentance word and letter count ";
        String words[] = sentance.split("");
        System.out.println(words.length);
        for (String word : words) {
        System.out.println(word);
        }
        
    }
}





















