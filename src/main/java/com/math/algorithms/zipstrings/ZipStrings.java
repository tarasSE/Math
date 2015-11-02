package com.math.algorithms.zipstrings;

public class ZipStrings {

    public static void main(final String[] args) {

        ZipStrings zipStrings = new ZipStrings();

        String s = "aaabbcccddddd";

        System.out.println(s);

        System.out.println(zipStrings.compressString(s));

        System.out.println(zipStrings.compressStringRecursive(s));

        System.out.println(zipStrings.compressStringRecursiveBeauty(s));

    }

    /*complexity is O(n)*/
    public String compressString(final String s) {

        StringBuilder stringBuilder = new StringBuilder();

        char lastChar = s.charAt(0);

        int counter = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == lastChar) {

                counter++;

                continue;

            }

            stringBuilder.append(lastChar)
                    .append(counter);

            lastChar = s.charAt(i);

            counter = 1;


        }

        stringBuilder.append(lastChar).append(counter);

        return stringBuilder.toString();
    }

    /*complexity is O(n)*/
    public String compressStringRecursive(final String s) {


        StringBuilder stringBuilder = new StringBuilder();

        char lastChar = s.charAt(0);

        int counter = 1;

        int charsCounter = 1;

        return compressStringRecursive(s, lastChar, counter, charsCounter, stringBuilder);

    }

    private String compressStringRecursive(final String s,
                                           char lastChar,
                                           int counter,
                                           int charsCounter,
                                           StringBuilder stringBuilder) {

        if (counter != s.length() && lastChar == s.charAt(counter)) {

            charsCounter++;

            counter++;

            compressStringRecursive(s, lastChar, counter, charsCounter, stringBuilder);

        } else if (counter != s.length() && lastChar != s.charAt(counter)) {

            stringBuilder.append(lastChar)
                    .append(charsCounter);

            charsCounter = 1;

            lastChar = s.charAt(counter);

            counter++;

            compressStringRecursive(s, lastChar, counter, charsCounter, stringBuilder);

        } else if (counter == s.length() - 1) {

            stringBuilder.append(charsCounter);

            return stringBuilder.toString();

        } else {

            stringBuilder.append(lastChar).append(charsCounter);

        }

        return stringBuilder.toString();
    }


    /*complexity is O(n)*/
    public String compressStringRecursiveBeauty(final String s) {


        StringBuilder stringBuilder = new StringBuilder();

        char lastChar = s.charAt(0);

        int counter = 1;

        int charsCounter = 1;

        return compressStringRecursiveBeauty(s, lastChar, counter, charsCounter, stringBuilder);

    }

    private String compressStringRecursiveBeauty(final String s,
                                                 char lastChar,
                                                 int counter,
                                                 int charsCounter,
                                                 StringBuilder stringBuilder) {

        if (counter != s.length() && lastChar == s.charAt(counter)) {

            charsCounter++;

            counter++;

            return compressStringRecursiveBeauty(s, lastChar, counter, charsCounter, stringBuilder);

        } else if (counter != s.length() && lastChar != s.charAt(counter)) {

            stringBuilder.append(lastChar)
                    .append(charsCounter);

            charsCounter = 1;

            lastChar = s.charAt(counter);

            counter++;

            return compressStringRecursiveBeauty(s, lastChar, counter, charsCounter, stringBuilder);

        } else if (counter == s.length() - 1) {

            stringBuilder.append(charsCounter);

            return stringBuilder.toString();

        } else {
            stringBuilder.append(lastChar).append(charsCounter);
        }

        return stringBuilder.toString();
    }


}
