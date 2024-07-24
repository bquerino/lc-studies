package com.brhenqu.br;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an string: ");
        String value = scanner.nextLine();
        System.out.println("Type the index: ");
        String character = scanner.nextLine();

        System.out.println("The index will be the first letter that you wrote on the previous step.");

        Solution solution = new Solution();
        var result = solution.reversePrefix(value, character.charAt(0));
        System.out.println("Reversed prefix: " + result);
    }
}