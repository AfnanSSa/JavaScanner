/*Given a string of any length, return a new string where the last 2 chars,
if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a string
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        String lastTwo = "";

        //checking if the entered words have at least 2 char
        if(word.length()>=2){
            char secondLastChar = word.charAt(word.length()-2) ;
            char lastChar = word.charAt(word.length()-1);
            lastTwo = word.substring(0,word.length()-2) +  lastChar + secondLastChar;
        } else {
            lastTwo = word;
        }
        //printing final result
        System.out.println("\n" + lastTwo);
    }
}
