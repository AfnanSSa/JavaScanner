//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

import java.util.Scanner;
public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name + "!");
    }
}
