import javax.sound.sampled.SourceDataLine;

public class largestNum {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int arr[] = { 1, 2, 3, 4, 33, 55, 0, -1, -12 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("largest number in array is " + largest);
    }

}
