/*Given 2 strings, return their concatenation,
except omit the first char of each.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter two words
        System.out.println("Enter the first word: ");
        String firstWord = scanner.nextLine();
        System.out.println("\nEnter the second word: ");
        String secondWord = scanner.nextLine();

        //Extracting the first letter from each word
        String firstNonStart = firstWord.substring(1);
        String secondNonStart = secondWord.substring(1);

        //Printing result
        System.out.println("\n" + firstNonStart + secondNonStart);


    }
}
