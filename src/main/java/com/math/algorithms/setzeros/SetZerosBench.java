package com.math.algorithms.setzeros;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Fork(1)
@Warmup(iterations = 5)
@State(Scope.Thread)
public class SetZerosBench {

    SetZeros setZeros = new SetZeros();

    private final int[][] matrix = {
            {1, 1, 1, 1, 0, 1},
            {1, 0, 1, 1, 1, 1},
            {1, 1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 1}};


    @Benchmark
    @Warmup(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void setZeros() {

        setZeros.setZerosOnMatrix(matrix);

    }

    @Benchmark
    @Warmup(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void setZerosOther() {

        setZeros.setZerosOnMatrixOther(matrix);

    }

}