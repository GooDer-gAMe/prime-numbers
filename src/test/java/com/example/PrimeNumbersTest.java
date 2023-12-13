package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumbersTest
{
    private PrimeNumbers p;

    @BeforeEach
    void setup() {
        p = new PrimeNumbers();
    }

    @Test
    void testPrimesOf1_shouldReturnEmptyList() {
        List<Integer> result = p.getPrimeNumbers(1);

        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    void testPrimesOf2() {
        List<Integer> result = p.getPrimeNumbers(2);

        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    void testPrimesOf3() {
        List<Integer> result = p.getPrimeNumbers(3);

        assertEquals(List.of(2), result);
    }

    @Test
    void testPrimesOf5() {
        List<Integer> result = p.getPrimeNumbers(5);

        assertEquals(List.of(2, 3), result);
    }

    @Test
    void testPrimesOfDecimalNumber() {
        List<Integer> result = p.getPrimeNumbers(5.5);

        assertEquals(List.of(2, 3, 5), result);
    }

    @Test
    void testPrimesOf20() {
        List<Integer> result = p.getPrimeNumbers(20);

        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19), result);
    }
}
