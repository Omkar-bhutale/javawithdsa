package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;

public class ArrayDeaque1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        System.out.println(adq.size());
        adq.add(121);
        adq.offer(123);
        adq.add(123);
        System.out.println(adq);//[121, 123, 123]
        adq.addLast(123);
        adq.addFirst(121);
        System.out.println(adq);//[121, 121, 123, 123, 123]  
        System.out.println(adq.peek());//121
        System.out.println(adq.peekFirst());//121
        System.out.println(adq.peekLast());//123
        System.out.println(adq.pollFirst());//121
        System.out.println(adq);//[121, 123, 123,123]
        System.out.println(adq.pollLast());//123
        System.out.println(adq);//[121, 123, 123]
        System.out.println(adq.pop());//121
        System.err.println(adq);//[123, 123]
        adq.push(12);
        System.out.println(adq);//[12, 121, 123]
        System.out.println(adq.poll());//12
       // Collections.sort(adq);


    }
    
}
