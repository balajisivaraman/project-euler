package com.balajisivaraman.projecteuler;

import java.util.stream.IntStream;

public class Euler {
    public static void main(String[] args) {
        final int multiplesOfThreeAndFive = IntStream.range(1, 1000).filter(i -> (i % 3 == 0 || i % 5 == 0)).sum();
        System.out.println(multiplesOfThreeAndFive);
    }
}
