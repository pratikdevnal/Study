
import java.util.*;

public class binToDecimal {
    public static void main(String[] args) {
        bindec(10);
    }

    public static void bindec(int binNum) {
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDig = binNum % 10;
            binNum = binNum / 10;
            decNum = decNum + (lastDig * (int) Math.pow(2, pow));
            pow++;

        }
        System.out.println("Decimal of " + mynum + " = " + decNum);
    }
}
