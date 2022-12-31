import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
}
