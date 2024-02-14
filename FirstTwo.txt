/*Given a string, return the string made of its first two chars, so the String
"Hello" yields "He". If the string is shorter than length 2, return whatever there is,
so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns
the length of a string.

firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a word
        System.out.println("Enter a word: ");
        String string = scanner.nextLine();

        String firstTwo;
        //Checking if word's length is more than two chars
        if (string.length()>=2){
            //Extracting & Splitting the first two chars
            firstTwo = string.substring(0,2);
        } else {
            //if length of entered word is less than teo chrs 
            firstTwo = string;
        }

        //Printing result
        System.out.println("\n" + firstTwo);
    }
}
