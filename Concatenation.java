/*Given two strings, append them together (known as "concatenation")
and return the result. However, if the concatenation creates a double-char,
then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter 2 strings
        System.out.println("Enter a word: ");
        String firstWord = scanner.nextLine();
        System.out.println("Enter another word: ");
        String secondWord = scanner.nextLine();

        String conCat= ""; 

        //checking if the entered words have at least 1 char
        if(firstWord.isEmpty() || secondWord.isEmpty()){
            //if one input is empty
            conCat = firstWord + secondWord;
        } else if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)){
            //if last char in first word is the same as the first char in second word
            conCat = firstWord + secondWord.substring(1); 
        } else {
            conCat = firstWord + secondWord;
        }
        //printing final result
        System.out.println("\n" + conCat);
    }
}
