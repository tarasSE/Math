package com.math.algorithms;

import java.util.ArrayList;
import java.util.List;

public class StringManipulator {
        public static void main(String... args){

                StringManipulator manipulator = new StringManipulator();

                String first = "first second овово оаоа оаоа  ";

                String second = "secondfirst";

                boolean a = manipulator.isStringsReverse(first, second);

                System.out.println(first.replaceAll(" ", "%20"));

                System.out.println(manipulator.replaceStringSpaces(first));


        }

        public boolean isStringsReverse(final String first, final String second){
                if(first.length() != second.length()) return false;

                char[] firstChars = first.toCharArray();

                char[] secondChars = second.toCharArray();

                java.util.Arrays.sort(firstChars);

                java.util.Arrays.sort(secondChars);


                for (int i=0; i<first.length(); i++){
                        if (firstChars[i] != secondChars[i]) return false;
                }

                return true;
        }

        public String replaceStringSpaces(final String first){

                char[] chars = first.toCharArray();

                List<Character> charList = charToCharacter(chars);

                List<Character> space = new ArrayList<>();

                space.add('%');
                space.add('2');
                space.add('0');

                for (int i=charList.size()-1; i>0; i--){

                        if(' ' == charList.get(i)){

                                charList.remove(i);
                                charList.addAll(i, space);
                        }
                }

                StringBuilder sb = new StringBuilder();

                for (Character ch : charList){
                        sb.append(ch);
                }

                return sb.toString();
        }

        private List<Character> charToCharacter(final char[] chars){


                List charList = new ArrayList();

                for (char ch : chars){
                        charList.add(ch);
                }
                return charList;
        }

}