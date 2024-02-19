/*Given a string, return true if the first 2 chars in the string
also appear at the end of the string, such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a string
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        boolean frontAgain = false;
        //Checking if entered has at least two chars
        if (word.length()>=2){
            String firstTwo = word.substring(0,2); //extracting first two chars
            String lastTwo = word.substring(word.length()-2); //extracting last two chars
            frontAgain = firstTwo.equals(lastTwo);
        }

        //printing final result
        System.out.println("\n" + frontAgain);
    }
}
