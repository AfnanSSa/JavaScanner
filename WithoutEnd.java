/*Given a string, return a version without the first and last char, so "Hello" yields "ell".
The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a word
        System.out.println("Enter a word: ");
        String string = scanner.nextLine();

        String withoutEnd="";
        //Checking if word's length is more than two
        if (string.length()>2){
            //Return the substring starting from index 1 (excluding first character)
            //and ending at index str.length() - 1 (excluding last character)
            withoutEnd = string.substring(1, string.length()-1);
        } else {
            //if length of entered word is less than three letters
            System.out.println("\n\"" + withoutEnd + "\"");
        }

        //Printing result
        System.out.println("\n\"" + withoutEnd + "\"");
    }
}
