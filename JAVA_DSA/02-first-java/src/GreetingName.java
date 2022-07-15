//Take name as input and print a greeting message for that name.
import java.util.Scanner;
public class GreetingName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Good morning "+name);

    }
}
