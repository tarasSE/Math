package com.math.simplenumbers.printer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumbersPrinterTest {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        NumbersPrinter numbersPrinter = new NumbersPrinterImpl();

        for (int i = 995; i < 1010; i++) {
            treeSet.add(i);
            hashSet.add(i);
            linkedHashSet.add(i);
        }

        System.out.println("TreeSet print:");
        numbersPrinter.print((TreeSet) treeSet);

        System.out.println("HashSet print:");
        numbersPrinter.print((HashSet) hashSet);

        System.out.println("LinkedHashSet print:");
        numbersPrinter.print((LinkedHashSet) linkedHashSet);
    }
}
