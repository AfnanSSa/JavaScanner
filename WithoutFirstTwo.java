/*Given a string, if a length 2 substring appears at both its beginning and
end, return a string without the substring at the beginning, so "HelloHe"
yields "lloHe". The substring may overlap with itself, so "Hi" yields "".
Otherwise, return the original string unchanged.

without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → "”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a string
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        String withoutTwo = "";
        if(word.length()>=2){
            String firstTwoChars = word.substring(0,2);
            String lastTwoChars = word.substring(word.length()-2);
            if (firstTwoChars.equals(lastTwoChars)){
                withoutTwo = word.substring(2);
            } else {
                withoutTwo = word;
            }
        }

        //printing final result
        System.out.println("\n\"" + withoutTwo + "\"");
    }
}
