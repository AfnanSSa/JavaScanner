/*Given a string and an int n, return a string made of the first and
last n chars from the string. The string length will be at least n.

nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a word
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        //checking if the word has at least n number of letters
        if (word.length()>=number){
            String firstPart=word.substring(0,number); //extracting first part
            String secondPart = word.substring(word.length()-number); //extracting second part
            String result = firstPart + secondPart;

            //printing result
            System.out.println("\n\""+ result + "\"");
        } else{
            System.out.println("number of letters in the word is less than the number you entered.");
        }

    }

}
