/*Given a string and a second "word" string, we'll say that
the word matches the string if it appears at the front of
the string, except its first char does not need to match
exactly. On a match, return the front of the string, or
otherwise return the empty string. So, so with the string
"hippo" the word "hi" returns "hi" and "xip" returns "hip".
The word will be at least length 1.

startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter 2 strings
        System.out.println("Enter a word: ");
        String firstWord = scanner.nextLine();
        System.out.println("Enter another word: ");
        String secondWord = scanner.nextLine();

        String startWord = "";
        if (firstWord.length()>=secondWord.length() && secondWord.substring(1).equals(firstWord.substring(1,secondWord.length()))){
            startWord = firstWord.substring(0, secondWord.length());
        }
        //printing final result
        System.out.println("\n\"" + startWord + "\"");
    }
}
