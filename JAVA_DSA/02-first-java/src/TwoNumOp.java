//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class TwoNumOp {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter Operator amoung +-*/");
        char op = sc.next().charAt(0);
        if('+' == op)
            System.out.println("Sum of both numbers is " + (num1 + num2));
    }
}
