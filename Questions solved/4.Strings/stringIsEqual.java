public class stringIsEqual {
    public static void main(String[] args) {
        String a = "tony";
        String b = "tony";
        String c = new String("tony");
        // if(a==b)
        // {
        //     System.out.println("is equal");
        // }
        // if(a==c)
        // {
        //     System.out.println("is equal");
        // }
        // else
        // {
        //     System.out.println("not equal");
        // }
        if(a.equals(c))
        {
            System.out.println("is equal");
        }
    }
}
