package CollectionFramework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class prorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(12);
        pq.offer(121);
        pq.offer(15);
        System.out.println(pq);//[12, 121, 15]
        System.out.println(pq.peek());
        pq.offer(50);
        System.out.println(pq);//[12, 50, 15, 121]
//System.out.println(pq.poll());

        ArrayList al = new ArrayList();
        while(!pq.isEmpty()){
            al.add(pq.poll());
        }
        System.out.println(al);//[12, 15, 50, 121]

        //List l1 =new ArrayList(al);
        ArrayList al1 = new ArrayList(pq);
        System.out.println(al1);//[]


        PriorityQueue<StudantMarks> pq1 = new PriorityQueue<>();
        pq1.offer(new StudantMarks(12, 066));
        pq1.offer(new StudantMarks(67, 88));
        pq1.offer(new StudantMarks(88, 88));
        pq1.offer(new StudantMarks(86,99 ));
      //  System.out.println(pq1);

        PriorityQueue<StudantMarks> pq2 = new PriorityQueue<>(new Comparator<StudantMarks>() {
            @Override
            public int compare(StudantMarks s1,StudantMarks s2){
                return s1.getMaths()-s2.getMaths();
            }
            
        });
        pq2.offer(new StudantMarks(12, 066));
        pq2.offer(new StudantMarks(67, 88));
        pq2.offer(new StudantMarks(88, 88));
        pq2.offer(new StudantMarks(86,99 ));
        //System.out.println(pq2);
        
        while(!pq2.isEmpty()){
            System.out.println(pq2.poll());
        }


        ////////////////
        PriorityQueue<StudantMarks> pq3= new PriorityQueue<StudantMarks>((s1,s2)->s2.getPhysics()-s1.getPhysics());

        pq3.offer(new StudantMarks(12, 066));
        pq3.offer(new StudantMarks(67, 88));
        pq3.offer(new StudantMarks(88, 88));
        pq3.offer(new StudantMarks(86,99 ));
        //System.out.println(pq2);
        
        while(!pq3.isEmpty()){
            System.out.println(pq3.poll());
        }
        
    }
    
}
