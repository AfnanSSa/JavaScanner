/*Given a string, return a new string made of 3 copies of the first 2
chars of the original string. The string may be any length. If there are
fewer than 2 chars, use whatever is there.

extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a strings
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        String extraFront = "";
        if(word.length()>=2){
            String firstTwoChars = word.substring(0,2);
            extraFront = firstTwoChars + firstTwoChars + firstTwoChars;
        } else {
            extraFront = word + word + word;
        }

        //printing final result
        System.out.println("\n" + extraFront);
    }
}
