/*Given a string, return a version without both the first and
last char of the string. The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a words
        System.out.println("Enter the a word: ");
        String word = scanner.nextLine();

        if(word.length()>=2){
            //Extracting the letters in the middle
            String withoutFirstLast = word.substring(1, word.length()-1);
            System.out.println("\n\"" + withoutFirstLast + "\"");
        }else{
            // If the string length is less than 2, print an empty string
            System.out.println("\n\"\"");
        }

    }
}
