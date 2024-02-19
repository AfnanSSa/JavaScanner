/*Given a string, return a version without the first 2 chars.
Except keep the first char if it is 'a' and keep the second char
if it is 'b'. The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a string
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        String deFront;
        if(word.length()<2){
            deFront = word;
        }else{
            char firstChar = word.charAt(0);
            char secondChar = word.charAt(1);

            if(firstChar=='a' && secondChar=='b'){
                deFront = word;
            } else if (firstChar=='a') {
                deFront = "a" + word.substring(2);
            } else if (secondChar=='b') {
                deFront = word.substring(1);
            } else {
                deFront = word.substring(2);
            }
        }

        //printing final result
        System.out.println("\n\"" + deFront + "\"");
    }
}
