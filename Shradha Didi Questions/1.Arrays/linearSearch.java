import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 1;
        int ans = linearS(num, key);
        if (ans == -1) {
            System.out.println("not found");
        } else {
            System.out.println("at index " + ans);
        }

        String fru[] = { "apple", "banana", "orange", "mango" };
        String key1 = "orange";
        int ans1 = linearSF(fru, key1);
        if (ans1 == -1) {
            System.out.println("not found");
        } else {
            System.out.println("at index " + ans1);
        }

    }

    public static int linearSF(String fru[], String key) {
        for (int i = 0; i < fru.length; i++) {
            if (key == fru[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int linearS(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (key == num[i]) {
                return i;
            }
        }
        return -1;
    }
}