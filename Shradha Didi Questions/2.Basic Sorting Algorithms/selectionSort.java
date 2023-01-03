import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPose = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPose] > arr[j]) {
                    minPose = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[minPose];
            arr[minPose] = temp;
        }
    }
}
