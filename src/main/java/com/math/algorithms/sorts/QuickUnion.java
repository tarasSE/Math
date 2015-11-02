package com.math.algorithms.sorts;

import java.util.Arrays;

public class QuickUnion {
    private int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }

    private int root(int i) {
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean find(int p, int q) {
        return root(p) == root(q);
    }

    public void unite(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public void print() {

        System.out.println(Arrays.toString(id));

    }

    public static void main(String[] args) {

        QuickUnion quickUnion = new QuickUnion(10);

        quickUnion.print();
        quickUnion.unite(6, 7);
        quickUnion.print();
        quickUnion.unite(2, 9);
        quickUnion.print();
        quickUnion.unite(0, 1);
        quickUnion.print();
        quickUnion.unite(4, 5);
        quickUnion.print();
        quickUnion.unite(0, 2);
        quickUnion.print();
        quickUnion.unite(3, 7);
        quickUnion.print();
        quickUnion.unite(5, 7);
        quickUnion.print();
        quickUnion.unite(4, 1);
        quickUnion.print();
        quickUnion.unite(2, 8);
        quickUnion.print();

    }
}