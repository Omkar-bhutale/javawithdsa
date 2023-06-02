package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.concurrent.LinkedTransferQueue;
import java.util.function.Consumer;

import javax.sound.midi.SysexMessage;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(11,2,23,42,53);
        //al.add(13);
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        al.forEach(a->System.out.println(a*2));
        System.out.println(al);
        al.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer a){
                System.out.println(a);

            }
        });
        System.out.println("this is java 8 features");

        Consumer cons = new Consumer<Integer>() {
            @Override
            public void accept(Integer a){
            System.out.println(a*10);}
        };
        al.forEach(cons);
    }


     
    
}
