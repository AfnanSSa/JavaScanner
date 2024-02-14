/*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a word
        System.out.println("Enter a word that has even length of letters: ");
        String string = scanner.nextLine();

        String firstHalf="";
        //Checking if word's length is even
        if (string.length()%2==0){
            //Extracting & Splitting the first half of the word
            firstHalf = string.substring(0, string.length()/2);
        } else {
            //if length of entered word is odd
            System.out.println("\nYou entered a word that has odd length of letters");
        }

        //Printing result
        System.out.println("\n" + firstHalf);
    }
}
