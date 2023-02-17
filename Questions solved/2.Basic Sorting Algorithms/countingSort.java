import java.util.*;

public class countingSort {
    public static void main(String[] args) {

        int arr[] = { 7, 1, 1, 3, 2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        System.out.println(Arrays.toString(count));
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
}
