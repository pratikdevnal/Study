//https://practice.geeksforgeeks.org/problems/max-min/1
//Given an array A of size N of integers. Your task is to find the sum of minimum and maximum elements in the array.
//Input:
//        N = 5
//        A[] = {-2, 1, -4, 5, 3}
//        Output: 1
//        Explanation: min = -4, max =  5. Sum = -4 + 5 = 1

//Input:
//        N = 4
//        A[]  = {1, 3, 4, 1}
//        Output: 5
//        Explanation: min = 1, max = 4. Sum = 1 + 4 = 5

//find minimum in array and maximum in array the return sum=max+min
public class maxMin {
    public static int findSum(int A[],int N)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum =0;

        for(int i=0;i<N;i++)
        {
            if(A[i]>max)
            {
                max = A[i];
            }
            if(A[i]<min)
            {
                min = A[i];
            }
            sum = max+min;
        }
        return sum;
    }
}
