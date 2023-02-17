import java.util.Arrays;

import java.util.*;

public class maxsubarrayPrefix {

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        System.out.println("Maximum is : " + prefixMax(arr));
    }

    public static int prefixMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.println("Prefix of array is " + Arrays.toString(prefix));

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int current = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (current > max) {
                    max = current;
                }

            }

        }
        return max;

    }

}
