import java.sql.SQLOutput;
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height and Base of Triangle");
        int height = sc.nextInt();
        int base = sc.nextInt();
        float area = (float)((height*base)/2);
        System.out.println(area);
    }
}
