import java.util.ArrayList;
import java.util.Scanner;

public class arraylst {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);//10 Is initial capacity of arraylist, Interger is wrapper class
        Scanner in = new Scanner(System.in);
//        list.add(10);
//        list.add(200);
//        list.add(20);
//        list.add(10);
//
//        System.out.println(list.contains(199));
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list.get(2));

        //input
        for (int i = 0; i <5;i++)
        {
            list.add(in.nextInt());
        }

        //Output
        //System.out.print(list);
//        for(int i =0;i<list.size();i++)
//        {
//            System.out.println(list.get(i));
//        }

    }
}
