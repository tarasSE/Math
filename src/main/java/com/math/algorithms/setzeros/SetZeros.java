package com.math.algorithms.setzeros;

import java.util.Arrays;

public class SetZeros {

    public static void main(String[] args) {
        SetZeros setZeros = new SetZeros();

        final int[][] matrix = {
                {1, 1, 1, 1, 0, 1},
                {1, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1}};


        System.out.println(Arrays.deepToString(setZeros.setZerosOnMatrix(matrix)));

        System.out.println(Arrays.deepToString(setZeros.setZerosOnMatrixOther(matrix)));

    }

    public int[][] setZerosOnMatrix(final int[][] matrixNxM) {

        boolean[] rows = new boolean[matrixNxM.length];

        boolean[] cols = new boolean[matrixNxM[0].length];

        for (int i = 0; i < matrixNxM.length; i++) {

            for (int j = 0; j < matrixNxM[i].length; j++) {

                if (matrixNxM[i][j] == 0) {

                    rows[i] = true;

                    cols[j] = true;

                }

            }
        }

        return setZeros(matrixNxM, rows, cols);
    }

    private int[][] setZeros(final int[][] matrix,
                             final boolean[] rows,
                             final boolean[] cols) {

        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        cloneMatrix(matrix, newMatrix);

        for (int i = 0; i < rows.length; i++) {

            for (int j = 0; j < cols.length; j++) {

                if (rows[i] || cols[j]) {

                    newMatrix[i][j] = 0;
                }

            }
        }

        return newMatrix;
    }

    private void cloneMatrix(int[][] matrix, int[][] newMatrix) {

        for (int i=0; i<matrix.length; i++){

            newMatrix[i] = matrix[i].clone();

        }
    }

    public int[][] setZerosOnMatrixOther(final int[][] matrixNxM) {

        boolean[] rows = new boolean[matrixNxM.length];

        boolean[] cols = new boolean[matrixNxM[0].length];

        for (int i = 0; i < matrixNxM.length; i++) {

            for (int j = 0; j < matrixNxM[i].length; j++) {

                if (matrixNxM[i][j] == 0) {

                    rows[i] = true;

                    cols[j] = true;

                }

            }
        }

        return setZerosOther(matrixNxM, rows, cols);
    }

    private int[][] setZerosOther(final int[][] matrix,
                                  final boolean[] rows,
                                  final boolean[] cols) {

        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        cloneMatrix(matrix, newMatrix);

        fillZeroToRows(newMatrix, rows);

        fillZeroToCols(newMatrix, cols);

        return newMatrix;
    }

    private void fillZeroToCols(int[][] newMatrix, boolean[] cols) {

        for (int i = 0; i < newMatrix.length; i++) {

            for (int j = 0; j < newMatrix[i].length; j++) {

                if (cols[j]) {

                    newMatrix[i][j] = 0;

                }

            }

        }

    }

    private void fillZeroToRows(int[][] newMatrix, boolean[] rows) {

        for (int i = 0; i < newMatrix.length; i++) {

            if (rows[i]) {

                Arrays.fill(newMatrix[i], 0);

            }
        }
    }
}
