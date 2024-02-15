/*Given a string and an index, return a string length 2 starting at the given index.
If the index is too big or too small to define a string length 2, use the first 2 chars.
The string length will be at least 2.

twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a word
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        //Prompting user to enter the number of the index
        System.out.println("Enter an index: ");
        int index = scanner.nextInt();

        //checking if the index is within the valid range
        if (index >= 0 && index + 2 <= word.length()){
            //If the index is within the valid range, extract a substring of length 2 starting from the given index
            String result= word.substring(index, index+2);
            //printing result
            System.out.println("\n\""+ result + "\"");
        } else {
            //if the index is too small or too big
            String result= word.substring(0, 2);
            //printing result
            System.out.println("\n\""+ result + "\"");

        }

    }

}
