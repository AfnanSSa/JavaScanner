/*Given 2 strings, a and b, return a string of the form short+long+short,
with the shorter string on the outside and the longer string on the inside.
 The strings will not be the same length, but they may be empty (length 0).

comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter 2 different words
        System.out.println("Enter two different words that have different lengths \nEnter the first word: ");
        String firstWord = scanner.nextLine();
        System.out.println("\nEnter the second word: ");
        String secondWord = scanner.nextLine();

        //Comparing lengths of two words
        if (firstWord.length() > secondWord.length()){
            //if first word is longer it will be printed in the middle
            System.out.println("\n" + secondWord + firstWord + secondWord );
        } else if (firstWord.length() < secondWord.length()) {
            //if second word is longer it will be printed in the middle
            System.out.println("\n" + firstWord + secondWord + firstWord );
        } else {
            //if words have the same length
            System.out.println("\nWords have the same length.");
        }
    }
}
