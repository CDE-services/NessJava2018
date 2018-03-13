import java.util.*;

public class BoxingTest {
    public static void main(String[] args) {
    	Integer iw = 3;     //autoboxing
        Boolean bw = true;  //autoboxing

        int i = iw;         //autounboxing
        boolean bool = bw;     //autounboxing

        iw = i;     //autoboxing
        bw = bool;     //autoboxing
        
      //BEWARE! Use int everywhere where possible!
        Integer i1 = 5; //boxing
        Integer i2 = 6; //boxing
        Integer i3 = i1 + i2; //unbox, add, box
        
        //Where useful:
        int a = 10;
        int b = 5;
        int c = Integer.min(a, b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.compare(a, b));
        
        //kolekcie - musim:
        List<Integer> list = new ArrayList<Integer>();
//        can't do: List<int> list = new ArrayList<int>();
        list.add(4);
        list.add(5);
        
        for(int integer : list) {
        	System.out.println(integer);
        }
    }
}
