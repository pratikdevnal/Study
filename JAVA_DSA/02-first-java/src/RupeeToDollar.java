//Input currency in rupees and output in USD.
import java.util.Scanner;
public class RupeeToDollar {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter amount in rupees");
       float rupees = sc.nextInt();
        float dollar = (float) (rupees * 74.61);
        System.out.println(dollar + " Dollars");
    }
}
