package com.math.simplenumbers;

import java.util.TreeSet;


public class SimpleNumbersFinder implements SimpleNumbersFinderInterface {

    public TreeSet<Integer> findSimplesOnInterval(int n) {
        addSimple(1);
        addSimple(2);

        for (int i = 3; i <= n; i++) {
            if (isSimple(i)) {
                addSimple(i);
            }
        }

        return getSimplesSet();
    }

    public boolean isSimple(int number) {
        if (number % 2 == 0 &&
                number != 2) {
            return false;
        } else {
            for (Integer simple : getSimplesSet()) {
                if (number % simple == 0 && simple != 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public void simplesPrinter(TreeSet<Integer> simples){
        StringBuilder stringBuilder = new StringBuilder();
        int maxNumberLength = simples.last().toString().length();

        int counter = 1; // В прошлый раз счеткик начинался с 0, поэтому единица сдвигалась.
        for (Integer simple : simples) {
            int currentSimpleLengh = simple.toString().length();
            int countOfSpaces = maxNumberLength-currentSimpleLengh;
            for (int i=0; i <= countOfSpaces; i++){
                stringBuilder.append(" ");
            }
            stringBuilder.append(simple);
            if (counter % 10 == 0) {
                stringBuilder.append("\n");
            }
            counter++;
        }

        System.out.println(
                stringBuilder.toString());
    }


    public TreeSet<Integer> getSimplesSet() {
        return simplesSet;
    }

    public void setSimplesSet(TreeSet<Integer> simplesSet) {
        this.simplesSet = simplesSet;
    }

    public void addSimple(Integer simple) {
        this.simplesSet.add(simple);
    }

    private TreeSet<Integer> simplesSet = new TreeSet<Integer>();

}
