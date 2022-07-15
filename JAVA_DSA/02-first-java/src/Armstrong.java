//To find Armstrong Number between two given number.
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int rem=0;
        int sum = 0;
        int check;
        check=num;
        while (check!=0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
        }
        if(num==sum)
        {
            System.out.println("is armstrong");
        }
        else
        {
            System.out.println("not armstrong");
        }
    }
}
