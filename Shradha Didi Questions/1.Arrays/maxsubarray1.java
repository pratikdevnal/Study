import java.util.*;

public class maxsubarray1 {
    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        System.out.println("max is " + printSubArrays(numbers));
    }

    public static int printSubArrays(int numbers[]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int current = 0;
                for (int k = start; k <= end; k++) {
                    current = current + numbers[k];
                }
                if (current > max) {
                    max = current;
                }
                System.out.println(current);
            }
        }
        return max;
    }

}
