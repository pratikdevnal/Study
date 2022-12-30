import java.util.*;

public class basic {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
        System.out.println("arrays");
    }
}