package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class LaunchAl1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(12);
        al.add(13);
        for (int i = 0; i < 20; i++) {
            al.add(i+10);
            
        }
        al.size();
        System.out.println(al);
        for (int i = 0; i < 22; i++) {
            al.set(i,i+10);
            
        }
        System.out.println((al )+  " "+al.size());
        int num = (int) al.get(11);//valid why

        System.out.println(num);
        
          //  al.removeIf(((int)al.get(i))/2==0)
          al.remove(3);
         // al.removeIf(null)
         al.trimToSize();
            
        
        System.out.println(al);
        System.out.println( al.indexOf(12));
        al.add(12);
        System.out.println( al.indexOf(12));//2
        System.out.println( al.lastIndexOf(12));//21
        System.out.println(al.contains(121));
        al.clear();
        System.out.println(al);

    }
    
    
}
