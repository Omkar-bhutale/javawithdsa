package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.RowFilter.Entry;





public class Map2 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1,"121");
        hm.put(2,"omkar");
        hm.put("three",null);
        hm.put(null,"three");
        hm.put('f',null);
        //////////////////////////////////////
        System.out.println(hm);
        Set st=hm.keySet();
        System.out.println(st);//[null, 1, 2, f, three]
        Collection cl= hm.values();
        System.out.println(cl);//[three, 121, omkar, null, null]
        Set st1 =hm.entrySet();
        System.out.println(st1);//[null=three, 1=121, 2=omkar, f=null, three=null]
        /////////////////////////////////////////////////////
        Iterator itr1 =st.iterator();
        System.out.println("========================");
        System.out.println("iterator for key set");
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        /////////////////////////////////////////
        System.out.println("========================");
        System.out.println("iterator for key value");
        Iterator itr2 = cl.iterator();
        while(itr2.hasNext()){
           // System.out.println(itr2.next());
           String str = (String)itr2.next();
           System.out.println(str);
        }
        //////////////////////////////////////////
        System.out.println("========================");
        System.out.println("iterator for entery");
        Iterator itr3 = st1.iterator();
        while(itr3.hasNext()){
           // System.out.println(itr3.next());
           Object obj = itr3.next();
           System.out.println(obj);
        }
        ////////////////////////
        System.out.println("=========================");
        System.out.println("iterator for entery");
        Iterator itr4 = st1.iterator();
        while(itr4.hasNext()){
           Map.Entry obj = (Map.Entry)itr4.next();
           System.out.println(obj);
        }
        //////////////////////////////////

        System.out.println("---------for each key------------");
        st.forEach((a)->System.out.println(a));
        System.out.println("---------for each Entry------------");
        ArrayList<Map.Entry> al = new ArrayList<>();
       // System.out.println(al.add());
        st1.forEach((a)->{al.add((Map.Entry)a);});
        System.out.println(al);
        al.forEach((a)->System.out.println("key : "+a.getKey()+" value : "+a.getValue()));

        
    }
    
}
