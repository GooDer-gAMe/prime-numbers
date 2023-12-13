package com.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers
{
    public List<Integer> getPrimeNumbers(double n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            double sqrt = Math.sqrt(i);

            boolean isPrime = true;
            for (int j = 2; j <= sqrt; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                primes.add(i);
        }
        return primes;
    }
}
