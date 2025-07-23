package com.calebh101;

public class Main {
    public static void main(String[] args) {
        Logger.print("Hello there!");
        Logger.verbose("Hello there!");
        Logger.warn("Hello there!");
        Logger.error("Hello there!");
        Logger.warn("Hello there!", 7);
        Logger.error("Hello there!", "ERR");
    }
}
