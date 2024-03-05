/* Valid Palindrome
* Objective: Determine if a string is a palindrome, ignoring non-alphanumeric characters and case.
* Explanation: This problem introduces string manipulation, including filtering out unwanted characters
* and using two-pointers technique to compare characters from the beginning and the end, moving towards the center.*/


import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a string: "); //prompting user to enter a string
        String input = scanner.nextLine();
        Boolean isPalindrome = isPalindrome(input);

        if (isPalindrome){
            System.out.println("\n'" + input + "' is palindrome");
        } else {
            System.out.println("\n'" + input + "' is not palindrome");
        }
    }
    public static Boolean isPalindrome(String input){
        String cleanInput = input.replaceAll("['  ,]","").toLowerCase();
        cleanInput.replace(" ","");
        Integer forward = 0;
        Integer backward = cleanInput.length() -1;
        Character leftChar;
        Character rightChar;

        while (forward < backward){
            leftChar = cleanInput.charAt(forward);
            rightChar = cleanInput.charAt(backward);

            if (!Character.isAlphabetic(leftChar)){
                forward++;
            } else if (!Character.isAlphabetic(rightChar)){
                backward--;
            } else {
                if (leftChar != rightChar){
                    return false;
                }
            }
            forward++;
            backward--;
        }
        return true;
    }
}
