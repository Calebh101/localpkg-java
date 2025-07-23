package com.calebh101;

public class Main {
    public static void main(String[] args) {
        Logger.print("Hello, world!");
        Logger.warn("Hello, world!");
        Logger.error("Hello, world!");
        Logger.verbose("Hello, world! (1)");
        Logger.setVerbose(false);
        Logger.verbose("Hello, world! (2)");
        Logger.setVerbose(true);
        Logger.verbose("Hello, world! (3)");
    }
}
