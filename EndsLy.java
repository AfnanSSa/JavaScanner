/*Given a string, return true if it ends in "ly".

        endsLy("oddly") → true
        endsLy("y") → false
        endsLy("oddy") → false*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a words
        System.out.println("Enter a word that has at least 2 letters: ");
        String word = scanner.nextLine();

        //checking if the word has 2 or more letters and end with 'ly'
        if(word.endsWith("ly")){
            //printing result
            System.out.println("\n This word ends with 'ly'");
        }else{
            System.out.println("\nThis word does not end with 'ly'");
        }
    }

}
