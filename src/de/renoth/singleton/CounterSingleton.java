package de.renoth.singleton;

import java.math.BigInteger;

public class CounterSingleton {
    private static CounterSingleton counterSingleton = new CounterSingleton();
    private static BigInteger counter;

    private CounterSingleton() {
        counter = BigInteger.valueOf(0);
    }

    public static CounterSingleton get() {
        System.out.println("Retrieving Singleton instance");
        counter = counter.add(BigInteger.ONE);
        return counterSingleton;
    }

    public String getCounterValue() {
        return counter.toString();
    }
}
