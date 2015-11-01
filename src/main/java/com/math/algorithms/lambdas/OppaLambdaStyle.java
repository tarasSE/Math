package com.math.algorithms.lambdas;

import java.util.ArrayList;
import java.util.List;

public class OppaLambdaStyle {

    public static void main(String[] args) {

        List list = new ArrayList<Integer>(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };

        PrintList printList = new PrintList();

        printList.printListConservative(list);

        printList.printListShort(list);

        printList.printListShorter(list);

        printList.printListTheShortest(list);

        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);

    }

    public static class PrintList {

        public void printListConservative(List<Integer> list) {

            for (Integer value : list){
                System.out.println(value);
            }

        }

        public void printListShort(List<Integer> list) {

            list.forEach((Integer value) -> System.out.println(value));

        }

        public void printListShorter(List list) {

            list.forEach( value -> System.out.println(value));

        }

        public void printListTheShortest(List list) {

            list.forEach(System.out::println);

        }

    }

}
