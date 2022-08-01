import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class multidimentionArray {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
//        int[][] arr = {
//                {1,2,3,4},
//                {5,6},
//                {7,8,9}
//        };

//        for(int row=0; row< arr.length;row++)
//        {
//            for(int col=0;col<arr[row].length;col++)
//            {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for(int row=0; row< arr.length;row++)
//        {
//            System.out.println(Arrays.toString(arr[row]));
//        }
//        Arraylist multi dimentional array
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialize arraylist
        for (int i = 0 ; i < 3 ; i++){
            list.add(new ArrayList<>());
        }
        System.out.println(list);
        //Add elements
        for (int i = 0;i<3;i++)
        {
            for (int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }

}
