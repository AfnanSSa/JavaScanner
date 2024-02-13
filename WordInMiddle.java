/*Given an "out" string length 4, such as "<<>>", and a word, return a new string
where the word is in the middle of the out string, e.g. "<<word>>".
 Note: use str.substring(i, j) to extract the String starting at index i
 and going up to but not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]".*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter 'out' string <<>> [[]] (()) {{}}
        System.out.println("Enter brackets (e.g. [[]], (()), <<>>): ");
        String out = scanner.nextLine();

        //Prompting user to enter a word to be between brackets
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        /*Extracting and splitting the brackets using substring(i,j)*/
        //Extracting first half of th brackets
        String firstHalf = out.substring(0, 2); //Splitting the first two entries

        //Extracting second half of th brackets
        String secondHalf = out.substring(2); //Splitting the last two entries (brackets.length() - 2)

        //Printing result
        System.out.println("\n" + firstHalf + word + secondHalf);
    }
}
