/*Given a string of odd length, return the string length 3 from its middle,
so "Candy" yields "and". The string length will be at least 3.

middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi”*/

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a word
        System.out.println("Enter a word of odd length: ");
        String word = scanner.nextLine();

        //checking if the entered word has odd length
        if (word.length() != 0){
            int middleIndex = word.length()/2;
            String middleThree = word.substring(middleIndex-1, middleIndex+2);
            System.out.println("\n\""+middleThree+"\"");
        } else {
            System.out.println("\nThe word you entered has even length.");
        }

    }

}
