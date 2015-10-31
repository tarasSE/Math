package com.math.algorithms.zipstrings;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Fork(1)
@Warmup(iterations = 5)
@State(Scope.Thread)
public class ZipStringsBench {

    ZipStrings zipStrings = new ZipStrings();

    String s = "aaabbcccddddddddffffdddddssaassffffddssas";


    @Benchmark
    @Warmup(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void zipStrings(){

        zipStrings.compressString(s);

    }

    @Benchmark
    @Warmup(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void zipStringsRecursive(){

        zipStrings.compressStringRecursive(s);

    }

}