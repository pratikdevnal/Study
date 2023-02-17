import java.util.*;;

public class kadanesMaxSum {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };

        System.out.println("Maximum is : " + kadanesMax(arr));
    }

    public static int kadanesMax(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int maxNum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (currentSum <= 0) {
                currentSum = 0;
            }
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
            currentSum = currentSum + arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        if (maxNum < 0 && maxSum == 0) {
            return maxNum;
        }
        return maxSum;
    }
}
