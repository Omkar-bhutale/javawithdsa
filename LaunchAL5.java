package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class LaunchAL5 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        for (int i = 0; i < 11; i++) {
            al.add(121+i);
            
        }
        System.out.println(al);//[121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131]
        System.out.println("=================");
        for (int i = 0; i < al.size(); i++) {
           System.out.println( al.get(i));
            
        }
        System.out.println("================");
        for(Object o:al){
            System.out.println(o);
        }
        System.out.println("================");
        //approch--->iterator
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //approch --->listiterator (<-back)(for->)
        System.out.println("============");
        //java 1.8
        al.forEach(i->System.out.println(i));
        




    }
    
}
