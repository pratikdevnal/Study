//To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String word = sc.next();
        System.out.println(word);
        boolean palindrome = true;
        for(int i=0;i<=(word.length()/2);i++)
        {
            if(word.charAt(i)!=word.charAt(word.length()-i-1))
            {
                palindrome=false;
                break;
            }
        }
        if(palindrome)
        {
            System.out.println("Is palindrome");
        }
        else
        {
            System.out.println("Is not palindrome");
        }


    }

}
