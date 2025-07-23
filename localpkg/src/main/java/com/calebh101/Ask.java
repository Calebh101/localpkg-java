package com.calebh101;

import java.util.Scanner;

public class Ask {
    private static final Scanner scanner = new Scanner(System.in);

    public static String string(String question) {
        System.out.print(question + " >> ");
        String input = scanner.nextLine();
        return input;
    }

    public static Integer integer(String question) {
        System.out.print(question + " >> ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            return number;
        } catch (Exception e) {
            return null;
        }
    }
}
