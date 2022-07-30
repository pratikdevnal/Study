import java.util.Arrays;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] rnos = new int[5];
//        for(int i = 0 ;i<rnos.length;i++)
//        {
//            rnos[i]= in.nextInt();
//        }
//        System.out.print(Arrays.toString(rnos));
    String[] str = new String[4];
    for(int i =0;i< str.length;i++)
    {
        str[i] = in.next();
    }
    for (String i:str)
    {
        System.out.println(i);
    }
        System.out.println(Arrays.toString(str));
    }
}
