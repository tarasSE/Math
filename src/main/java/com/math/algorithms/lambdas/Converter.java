package com.math.algorithms.lambdas;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}