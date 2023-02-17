package Basics;

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = Sc.nextInt();
        int div = 2;
        boolean isPrime = true;
        while (div < a) {
            if (a % div != 0) {
                div = div + 1;
            } else {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("Numeber is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
    }
}
