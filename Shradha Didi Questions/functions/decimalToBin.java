// package funtions;

import java.util.*;

public class decimalToBin {
    public static void main(String[] args) {
        decToBin(8);
    }

    public static void decToBin(int n) {
        int myNum = n;
        int binNum = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) (Math.pow(10, pow)));
            pow++;
            n = n / 2;

        }
        System.out.println(binNum);

    }

}
