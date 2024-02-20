/*Given a string, if the first or last chars are 'x', return the string
without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a string
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        String withoutX = "";
        if(!word.isEmpty() && word.charAt(0)=='x' || word.charAt(word.length()-1)=='x')
        {
            if(word.charAt(0)=='x' && word.charAt(word.length()-1)=='x'){
                withoutX = word.substring(1,word.length()-1);
            } else if (word.charAt(0)=='x'){
                withoutX = word.substring(1);
            } else {
                withoutX = word.substring(0,word.length()-1);
            }
        }
        //printing final result
        System.out.println("\n\"" + withoutX + "\"");
    }
}
