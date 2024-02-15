/*Given a string of even length, return a string made of the middle two chars,
 so the string "string" yields "ri". The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter two words
        System.out.println("Enter a word with even number of letters: ");
        String word = scanner.nextLine();

        //Checking if the word has even number of letters and has at least 2 letters
        if(word.length()%2==0 && word.length()>=2){
            //Calculating the middle index of the word
            int middleIndex = word.length()/2;
            //Extracting middle letters 
            String middleTwo = word.substring(middleIndex-1, middleIndex+1);
            /*if the word has only 2 letters it will return them with no change*/

            //Printing result
            System.out.println("\n" + middleTwo);
        }else if(word.length()%2!=0){
            //if word has odd number of letters
            System.out.println("\nEnter a word with even number of letters.");
        }else{
            //if word letters equals to 0
            System.out.println("\nEnter a word that has at least 2 letters.");
        }

    }
}
