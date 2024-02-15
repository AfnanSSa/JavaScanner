/*Given a string, return a string length 1 from its front, unless front is false,
in which case return a string length 1 from its back. The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompting user to enter a words
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("Enter 1 to extract first letter form the word.\nEnter 0 to extract last letter from the word: ");
        int option = scanner.nextInt();

        if(option==1 && word.length()>=1){
            //Extracting first letter
            String onlyFirst = word.substring(0,1);
            System.out.println("\n\"" + onlyFirst + "\"");
        }else if (option==0 && word.length()>=1){
            //Removing last letter
            String onlyLast = word.substring(word.length()-1);
            System.out.println("\n\"" + onlyLast + "\"");
        }else{
                System.out.println("\nEnter only 0 or 1");
    }
        }

    }
