/*Given a string, return a "rotated left 2" version where the first 2 chars
are moved to the end. The string length will be at least 2.

left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a words
        System.out.println("Enter the a word: ");
        String word = scanner.nextLine();

        if(word.length()>=2){
            //Extracting the first two letters from the word
            String firstTwo = word.substring(0, 2);
            //Splitting the rest of the word
            String restOfWord = word.substring(2);
            //Rotating the new parts
            String rotation = restOfWord + firstTwo;
            //Printing result
            System.out.println("\n" + rotation);
        } else {
            // If the string length is less than 2, print the string as is
            System.out.println("\n" + word);
        }
    }
}
