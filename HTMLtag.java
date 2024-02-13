/*The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter HTML tag: ");
        String tag = scanner.nextLine();

        System.out.println("Enter the content: ");
        String content = scanner.nextLine();

        System.out.println("\n <" + tag + ">" + content + "</" + tag + ">");
    }
}
