package com.calebh101;

import java.time.Instant;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Logger {
    private static boolean useVerbose = false;
    private static boolean useBold = false;
    private static boolean useBoldForSuccess = true;

    public static String effect() {
        return effect(0);
    }

    public static String effect(int... effects) {
        return Arrays.stream(effects).mapToObj(e -> ("\u001B[" + e + "m")).collect(Collectors.joining());
    }

    private static void _log(String prefix, Object input, Integer effects, boolean bold, Object code) {
        String effectString = (effects != null ? effect(effects) : "");
        String joined = String.valueOf(input);
        System.out.println(effect(0) + "> " + effectString + prefix + " " + Instant.now().toString() + " >> " + (bold ? effect(1) : "") + joined + effect() + effectString + (code != null ? (" (code " + String.valueOf(code) + ")") : "") + effect());
    }

    public static void print(Object input) {
        _log("LOG", input, null, false, null);
    }

    public static void verbose(Object input) {
        if (useVerbose != true) return;
        _log("VBS", input, 2, false, null);
    }

    public static void success(Object input) {
        _log("PAS", input, 32, useBold && useBoldForSuccess, null);
    }

    public static void warn(Object input) {
        _log("WRN", input, 33, useBold, null);
    }

    public static void error(Object input) {
        _log("ERR", input, 31, useBold, null);
    }

    public static void success(Object input, Object code) {
        _log("PAS", input, 32, useBold && useBoldForSuccess, code);
    }

    public static void warn(Object input, Object code) {
        _log("WRN", input, 33, useBold, code);
    }

    public static void error(Object input, Object code) {
        _log("ERR", input, 31, useBold, code);
    }

    public static void setVerbose(boolean input) {
        useVerbose = input;
    }

    public static void enableVerbose() {
        useVerbose = true;
    }
}