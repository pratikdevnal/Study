public class stringBuilder{
 public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("");
    for(char ch ='a'; ch<='z';ch++)
    {
        sb.append(ch);
    }
    System.out.println(sb);
 }
}
//strings are immutable for security purpose in java
//string variables are stored in string pool...
//str1 = "tony"
//str2 = "tony"
//str1 and str2 points to the same "tony" object
//whenever we are making changes in any string variable it doesnt change the value but create new object
//read about interning.