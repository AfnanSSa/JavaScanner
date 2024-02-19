/*Given two strings, append them together (known as "concatenation") and
 return the result. However, if the strings are different lengths, omit
 chars from the longer string, so it is the same length as the shorter string.
 So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter two strings
        System.out.println("Enter a word: ");
        String firstWord = scanner.nextLine();
        System.out.println("Enter a word: ");
        String secondWord = scanner.nextLine();

        int firstLength = firstWord.length();
        int secondLength = secondWord.length();

        String minCat = "";
        if (firstLength>secondLength){
            minCat = firstWord.substring(firstLength-secondLength) + secondWord;
        } else if (secondLength>firstLength){
            minCat = secondWord.substring(secondLength-firstLength) + firstWord;
        } else {
            minCat = firstWord + secondWord;
        }

        //printing final result
        System.out.println("\n" + minCat);
    }
}
