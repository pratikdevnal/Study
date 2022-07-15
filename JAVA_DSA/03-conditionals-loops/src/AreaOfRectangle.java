import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height and width");
        int height = sc.nextInt();
        int width = sc.nextInt();
        int area = height*width;
        System.out.println(area);
    }
}
