package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LaunchAL4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(121);
        al.add(13);
        System.out.println(al);//[121, 13]
        al.add(0,12);
        System.out.println(al);//[12, 121, 13]
        ArrayList al2 = new ArrayList();
        al2.add(12);
        al2.add(23);
        al2.add(34);
      //  al2.add(al);
      //  System.out.println(al2);//[12, 23, 34, [12, 121, 13]]
        //--------------------
       // al2.addAll(al);
      //  System.out.println(al2);//[12, 23, 34, 12, 121, 13]
    //   ----------------------------------
        al2.addAll(1, al);
        System.out.println(al2);//[12, 12, 121, 13, 23, 34]
        al2.removeAll(al);
        System.out.println(al2);//[23, 34]
        al2.get(0);//21
        System.out.println(al.contains(12));//true
        System.out.println(al.isEmpty());//false
        al2.addAll(al);
        System.out.println(al2);//[23, 34, 12, 121, 13]
        al2.retainAll(al);
        System.out.println(al2);//[12, 121, 13]
        //set(int index,object obj)
       // al.lastIndexOf(12)
        //al.indexOf(al2);
        //al.lastIndexOf(12);
        Collections.sort(al);
        System.out.println(al);
        System.out.println(Collections.binarySearch(al,121));
        Collections.reverse(al);
        System.out.println(al);
        al.add(123);
        al.add(500);
        System.out.println(al);
       System.out.println( Collections.max(al));
       System.out.println(Collections.min(al));
      

    }
    
}
