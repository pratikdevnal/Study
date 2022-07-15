//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        if(a>b)
        {
            System.out.println(a+ " Is greater than " +b);
        } else if (a==b) {
            System.out.println(a+ " Is Equal to " +b);
        }
        else
        {
            System.out.println(b+ " Is greater than " +a);
        }
    }
}
