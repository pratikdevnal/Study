import java.util.Arrays;
import java.util.Scanner;
public class linearSearch {
    public static void main(String args[]) {
//    int[] arr = {18,12,9,14,77,50};
        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
//    System.out.println(linearsearch(arr,53));
//    String name = "pratik";
//    char target = 'a';
//        System.out.println(search(name,target));
//        System.out.println(searchInRange(2,5,14,arr));
//        System.out.println("Minimum number is "+findMin(arr));
//        System.out.println(Arrays.toString(searchin2dArray(arr,56)));
//        System.out.println(searchMaxin2dArray(arr));

    }

    static int searchMaxin2dArray(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>max)
                {
                    max = arr[i][j];
                }
            }

        }
        return max;
    }
    static int[] searchin2dArray(int[][] arr,int target)
    {
        if(arr.length==0)
        {
            return new int[]{-1,-1};
        }
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
    static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int element:arr) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }
    static int searchInRange(int start,int end, int target, int[] arr)
    {
        int i = start;
        if(arr.length==0 || end>= arr.length)
        {
            return -1;
        }
        for(i=start;i<=end;i++)
        {
            if(target==arr[i])
            {
                return i;
            }
        }
        return i;
    }

    static boolean search(String name,char target)
    {
        if(name.length()==0)
        {
            return  false;
        }
//        for (int i = 0;i<name.length();i++)
//        {
//            if(target==name.charAt(i))
//            {
//                return true;
//            }
//        }
        for (char ch : name.toCharArray())
        {
            if(ch==target)
            {
                return true;
            }
        }
        return false;
    }

    static int linearsearch(int target, int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
            {
                return i;
            }
        }
        return -1;
    }


    static Boolean linearsearch(int[] arr,int target)
    {
        for(int i:arr)
        {
            if(i==target)
            {
                return true;
            }
        }
        return false;
    }
}