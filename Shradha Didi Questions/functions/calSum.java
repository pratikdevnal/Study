package functions;

import java.util.*;

public class calSum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sums = sums(a, b);
        System.out.println(sums);
    }

    public static int sums(int a, int b) {

        int sum = a + b;
        return sum;

    }
}
