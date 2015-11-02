package com.math.algorithms.sorts;

import java.util.Arrays;

public class QuickFind {
    private int[] id;

    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public boolean find(int p, int q) {
        return id[p] == id[q];
    }

    public void unite(int p, int q) {
        int pid = id[p];
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid) id[i] = id[q];
    }

    public void print() {

        System.out.println(Arrays.toString(id));

    }

    public static void main(String[] args) {

        QuickFind quickFind = new QuickFind(10);

        quickFind.print();
        quickFind.unite(2,9);
        quickFind.print();
        quickFind.unite(6,2);
        quickFind.print();
        quickFind.unite(7,3);
        quickFind.print();
        quickFind.unite(9,4);
        quickFind.print();
        quickFind.unite(3,0);
        quickFind.print();
        quickFind.unite(6,0);
        quickFind.print();
    }
}