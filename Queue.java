package CollectionFramework;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        //Queue q = new Queue();
        PriorityQueue pq = new PriorityQueue();
        pq.add(121);
        pq.offer(12);
        
        System.out.println(pq);//[12, 121]
       System.out.println( pq.peek());//12
       pq.add(15);
       System.out.println(pq);//[12, 121, 15]
       System.out.println(pq.poll());//12
       System.out.println(pq);
       pq.add(23);
       pq.add(50);
       pq.add(45);
       System.out.println(pq);//[15, 45, 23, 121, 50]
       System.out.println(pq.contains(50));//true
       System.out.println(pq.poll());//15
       System.out.println(pq);//[23, 45, 50, 121]
       System.out.println(pq.remove(66));//false
       System.out.println(pq.remove(45));//true
       System.out.println(pq);//[23, 121, 50]
       pq.add(50);
      pq.offer(50);
       System.out.println(pq);//[23, 50, 50, 121, 50]//duplicates allowed
       

    }
    
}
