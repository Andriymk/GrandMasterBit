package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        System.out.println("How are you?");

        var scanner = new Scanner(System.in);
        var answer = scanner.nextLine();

        System.out.println("User answered: " + answer);
    }
}