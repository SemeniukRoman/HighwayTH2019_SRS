package lesson2;

public class StringPhrase {
    public static void main(String args[]) {
        String word = "Hello";
        String firstName = "Jack";
        String lastName = "Sparrow";
        String phrase = word + firstName + lastName;
        System.out.println("PHRASE: " + phrase);
        System.out.println();
        System.out.println("PHRASE WITH SPACES: " + word + " " + firstName + " " + lastName + "!");
    }
}
