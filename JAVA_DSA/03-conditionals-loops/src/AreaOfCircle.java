import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of Radius");
        float r = sc.nextFloat();
        float Area = (float) (Math.PI * Math.pow(r,2));
        System.out.println("Area of Circle is "+Area);
    }
}
