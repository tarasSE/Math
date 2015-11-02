package com.math.algorithms.sorts;

import java.util.Arrays;

public class WeightedQuickUnion {
    private int[] id;

    private int[] sz;

    public WeightedQuickUnion(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
        Arrays.fill(sz, 1);
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
        if (i == j) return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }

    }

    public void print() {

        System.out.println(Arrays.toString(id));

    }

    public static void main(String[] args) {

        WeightedQuickUnion quickUnion = new WeightedQuickUnion(10);

        quickUnion.print();
        quickUnion.unite(0,2);
        quickUnion.print();
        quickUnion.unite(4,8);
        quickUnion.print();
        quickUnion.unite(0, 1);
        quickUnion.print();
        quickUnion.unite(3,7);
        quickUnion.print();
        quickUnion.unite(9,5);
        quickUnion.print();
        quickUnion.unite(9,8);
        quickUnion.print();
        quickUnion.unite(0,7);
        quickUnion.print();
        quickUnion.unite(8, 1);
        quickUnion.print();
        quickUnion.unite(1,6);
        quickUnion.print();

    }
}