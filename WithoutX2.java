/*Given a string, if one or both of the first 2 chars is 'x', return
the string without those 'x' chars, and otherwise return the string
unchanged. This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a string
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        String withoutX2 = "";
        if(!word.isEmpty() && word.charAt(0)=='x' || word.charAt(1)=='x')
        {
            if(word.charAt(0)=='x' && word.charAt(1)=='x'){
                withoutX2 = word.substring(2);
            } else if (word.charAt(0)=='x'){
                withoutX2 = word.substring(1);
            } else {
                withoutX2 = word.charAt(0) + word.substring(2);
            }
        }
        //printing final result
        System.out.println("\n\"" + withoutX2 + "\"");
    }
}
