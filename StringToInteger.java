package com.example.demo;

public class StringToInteger {

    public static void main(String[] args) {
        String numStr = "aB58f91d";
        System.out.println("Convert String to int: " + numStr);
        System.out.println("Result: "+convertStringToInt(numStr));
    }

    /**
     * Convert String to int without parse function.
     *
     * @param numStr input string.
     * @return number from convert
     */
    public static int convertStringToInt(String numStr) {

        int zeroAscii = (int) '0';
        int nineAscii = (int) '9';
        int sum = 0;
        if (numStr != null && numStr.length() > 0) {
            for (int i = 0; i < numStr.length(); i++) {

                if (numStr.charAt(i) >= '0' && numStr.charAt(i) <= '9') {
                    sum = sum * 10 + (numStr.charAt(i) - '0');
                }

            }
        }
        return sum;
    }
}
