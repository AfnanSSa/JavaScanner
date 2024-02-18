/*Given a string, return a string length 2 made of its first 2 chars.
If the string length is less than 2, use '@' for the missing chars.

atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a word
        System.out.println("Enter a word with at least 3 letters: ");
        String word = scanner.nextLine();

        String atFirst;
        //checking if the entered word length is at least 2
        if (word.length() >= 2) {
            atFirst = word.substring(0,2);
        } else {
            atFirst = word + "@";
        }

        System.out.println("\n" + atFirst);
    }
}
