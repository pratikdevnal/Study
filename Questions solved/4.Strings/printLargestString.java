public class printLargestString {
    // compare them lexicographic
    //use compareTo function
    //comparetoIgnoreCase
    // str1.compareTo(str2)=>
    // 0 : both are equal
    // <0 : (less than zero) means str1<str2
    // >0 : (greater than zero) means str1>str2
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++)
        {
            if(largest.compareToIgnoreCase(fruits[i])<0)
            {
                largest=fruits[i];
            }
        }
        System.out.println(largest);

    }
}
