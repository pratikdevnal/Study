import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.sqrt;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int i=2;
        boolean isPrime=true;
        while (i<=sqrt(num))
        {
            if((num%2)==0) {
                System.out.println("number is composite");
                isPrime = false;
                break;
            }
        }
        if(isPrime==true)
        {
            System.out.println("number is Prime");
        }
    }

}
