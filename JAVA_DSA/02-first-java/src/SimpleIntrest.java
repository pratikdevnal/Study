//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//SI=(Principal amount * Rate of Interest * Time Period)
import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        float P = sc.nextInt();
        System.out.println("Enter Time period in years");
        float T = sc.nextInt();
        float SI = (float) (P*T*0.04);
        System.out.println("Simple intrest is "+SI);
        System.out.println("Amount is "+ (SI+P));
    }
}
