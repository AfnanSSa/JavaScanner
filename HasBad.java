/*Given a string, return true if "bad" appears starting at index 0 or 1
in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
The string may be any length, including 0. Note: use .equals() to compare 2 strings.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a word
        System.out.println("Enter a word with at least 3 letters: ");
        String word = scanner.nextLine();

        //checking if the entered word length is at least 3
        if (word.length() >= 3) {

            //checking if "bad" appears at the beginning of the string
            if (word.substring(0, 3).equals("bad")) {

                System.out.println("\nTrue"); //printing true if the word has 'bad' in indexes 0 or 1

            //if "bad" appears starting from the second character of the string
            } else if (word.length() >= 4 && word.substring(1, 4).equals("bad")) {

                System.out.println("\nTrue"); //printing true if the word has 'bad' in indexes 0 or 1

            } else {
                System.out.println("\nFalse");//printing false if the word doesn't have 'bad' in indexes 0 or 1
            }

        } else {
            System.out.println("\nEnter a word with at least 3 letters"); //if word has less than 3 letters
        }
    }
}
