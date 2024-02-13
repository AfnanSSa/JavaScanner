/*Given two strings, a and b, return the result of putting them
together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"*/

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String firstString = scanner.nextLine();
        
        System.out.println("Enter another string: ");
        String secondString = scanner.nextLine();
        
        System.out.println("\n"+firstString+secondString+secondString+firstString);
    }
}
