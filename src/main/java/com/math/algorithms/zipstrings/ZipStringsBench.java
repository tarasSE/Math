package com.math.algorithms.zipstrings;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

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
    @Measurement(iterations = 1000, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void zipStrings(){

        zipStrings.compressString(s);

    }

    @Benchmark
    @Warmup(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 1000, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void zipStringsRecursive(){

        zipStrings.compressStringRecursive(s);

    }

    @Benchmark
    @Warmup(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 1000, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void zipStringsRecursiveBeauty(){

        zipStrings.compressStringRecursiveBeauty(s);

    }

    public static void main(String[] args) throws RunnerException {
        Options optionsBuilder = new OptionsBuilder()
                .include(ZipStringsBench.class.getSimpleName())
                .forks(1)
                .measurementIterations(1)
                .warmupIterations(2).
                        build();

        new Runner(optionsBuilder).run();
    }

}