import java.util.*;

public class binarysearch {

    public static void main(String args[]) {
        int numbers[] = { 2, 3, 4, 6, 7, 9, 10, 12, 14 };
        int key = 10;
        System.out.println(search(numbers, key));
    }

    public static int search(int num[], int key) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            } else if (mid < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}