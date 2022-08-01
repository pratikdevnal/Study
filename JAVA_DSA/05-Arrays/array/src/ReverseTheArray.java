//https://practice.geeksforgeeks.org/problems/reverse-a-string/1
//Input:
//        s = Geeks
//        Output: skeeG

//Input:
//        s = for
//        Output: rof

public class ReverseTheArray {
        // Complete the function
        // str: input string
        public static String reverseWord(String str)
        {
            String b = new String();
            char[] a = new char[str.length()];
            for(int i=0;i<str.length();i++)
            {
                a[i]=str.charAt(i);
            }
            for(int i=0;i<str.length();i++)
            {
                b=b+a[a.length-i-1];
            }
            return b;
        }

    }

