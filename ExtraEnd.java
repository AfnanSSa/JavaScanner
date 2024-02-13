/*Given a string, return a new string made of 3 copies of the last 2
chars of the original string. The string length will be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a word
        System.out.println("Enter a word: ");
        String string = scanner.nextLine();

        //Extracting & Splitting the last two chars
        String extraEnd = string.substring(string.length() - 2);

        //Printing result
        System.out.println("\n" + extraEnd + extraEnd + extraEnd);
    }
}
