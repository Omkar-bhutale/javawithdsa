package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

class studant{
    int id; 
    String name;
    public studant(int id ,String name){
        this.id = id;
        this.name=name;
    }
    @Override
    public String toString(){
        return id + " " +name;
    }

}

public class LaunchAL6 {
    public static void main(String[] args) {
        studant s = new studant(1212,"omkar");
        //System.out.println(s);//s.toString
        System.out.println(s);
        ArrayList<studant> al = new ArrayList<>();
        al.add(new studant(11,"omi"));
        al.add(new studant(12, "supla"));
        al.add(new studant(12, "raju"));
        al.add(new studant(14, "sonu"));
        System.out.println(al);System.out.println("===========");
        for(int i=al.size()-1;i>=0;i--){
            System.out.println(al.get(i));
        }
        System.out.println("++++++");
      //  ListIterator<studant> sitr = al.listIterator(al.size());
      ListIterator<studant> sitr = al.listIterator();

        System.out.println(sitr.previousIndex());
        System.out.println("=============");
       // System.out.println(sitr.next());
        System.out.println("===========");
    
        while(sitr.hasNext()){
           System.out.println( sitr.next());
        }
        
        System.out.println("============");
        System.out.println("next index="+sitr.nextIndex());
        while(sitr.hasPrevious()){
           System.out.println( sitr.previous());
        }





        
    }
    
}
