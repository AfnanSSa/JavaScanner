/*Given a string, if the string begins with "red" or "blue"
return that color string, otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue”*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a string
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        String seeColor = "";

        if(word.startsWith("red")){  //checking if the entered word begins with 'red'
            seeColor = "red";
        } else if (word.startsWith("blue")) { //checking if the entered word begins with 'blue'
            seeColor = "blue";
        }
        //printing final result
        System.out.println("\n\"" + seeColor + "\"");
    }
}
