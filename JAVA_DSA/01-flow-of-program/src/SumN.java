import java.util.Scanner;
public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =0;
        System.out.println("Enter Numbers");
        boolean conti=true;
        while (conti)
            if (sc.hasNextInt())
                a = a + sc.nextInt();
             else
                conti = false;
        System.out.println(a);
    }


}
