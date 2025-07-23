package com.calebh101;

import java.time.Instant;

public class Logger {
    private static boolean useVerbose = true;

    public static void print(String input) {
        System.out.println("\u001B[0m" + "LOG " + Instant.now().toString() + " > " + input + "\u001B[0m");
    }

    public static void verbose(String input) {
        if (useVerbose != true) return;
        System.out.println("\u001B[0m\u001B[2m" + "VBS " + Instant.now().toString() + " > " + input + "\u001B[0m");
    }

    public static void warn(String input) {
        System.out.println("\u001B[0m\u001B[33m" + "WAR " + Instant.now().toString() + " > " + input + "\u001B[0m");
    }

    public static void error(String input) {
        System.out.println("\u001B[0m\u001B[31m" + "ERR " + Instant.now().toString() + " > " + input + "\u001B[0m");
    }

    public static void setVerbose(boolean input) {
        useVerbose = input;
    }
}