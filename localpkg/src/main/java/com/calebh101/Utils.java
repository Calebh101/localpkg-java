package com.calebh101;

import java.time.Instant;

public class Utils {
    public static void print(String input) {
        System.out.println("\u001B[0m" + "LOG " + Instant.now().toString() + " > " + input + "\u001B[0m");
    }

    public static void warn(String input) {
        System.out.println("\u001B[33m" + "WAR " + Instant.now().toString() + " > " + input + "\u001B[0m");
    }

    public static void error(String input) {
        System.out.println("\u001B[31m" + "ERR " + Instant.now().toString() + " > " + input + "\u001B[0m");
    }
}