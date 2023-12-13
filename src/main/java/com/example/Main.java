package com.example;

import java.util.List;

public class Main
{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("USAGE:\n\tcom.example.Main 12.2\n\n\tWhere 12.2 can be changed to any integer or double value");
            System.exit(0);
        }

        List<Integer> nums = new PrimeNumbers().getPrimeNumbers(Double.parseDouble(args[0]));
        for (Integer i : nums)
            System.out.print(i + " ");
    }
}
