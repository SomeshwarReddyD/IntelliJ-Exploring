package com.infy.test.java17;

public class EnhancedSwitchCaseDemo {
    public static void main(String[] args) {
        String s = "ravi";
        System.out.println(demoSwitch(s));
    }

    private static int demoSwitch(String obj) {
        return switch (obj) {
            case "ravi" -> obj.length();
            case "mon", "tues" -> 1;
            default -> 0;

        };
    }
}
