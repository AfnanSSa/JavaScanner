/*Given 2 strings, a and b, return a new string made of the first
char of a and the last char of b, so "yo" and "java" yields "ya".
If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter 2 strings
        System.out.println("Enter a word: ");
        String firstWord = scanner.nextLine();
        System.out.println("Enter another word: ");
        String secondWord = scanner.nextLine();

        String lastChars= "";

        //checking if the entered words have at least 1 char
        if (firstWord.length()>=1 && secondWord.length()>=1){
            lastChars = firstWord.substring(0,1) + secondWord.substring(secondWord.length()-1);
        } else if (firstWord.length()==0 && secondWord.length()>=1){
            //if the first word has length of zero
            lastChars = '@' + secondWord.substring(secondWord.length()-1);
        } else if (secondWord.length()==0 && firstWord.length()>=1){
            //if the second word has length of zero
            lastChars = firstWord.substring(0,1) + '@';
        } else {
            //if both words were zero in length
            lastChars = "@" + "@";
        }
        //printing final result
        System.out.println("\n"+lastChars);
    }
}
