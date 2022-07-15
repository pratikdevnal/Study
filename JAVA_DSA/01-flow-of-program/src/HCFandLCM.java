import java.util.Scanner;
public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = (a<b)?a:b;
        int HCF=0;
        System.out.println(min);
        for(int i=1;i<=min;i++)
        {
            if((a%i==0) && (b%i==0))
            {
                HCF=i;
            }
        }
        System.out.println("HCF is "+HCF);
        System.out.println("LCM is "+ ((a*b)/HCF));


    }
}
