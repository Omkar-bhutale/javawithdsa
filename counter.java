//package java_program.static;

public class counter {
    static int count =m1();
    static int m1(){
        System.out.println("static m1 methood");
        return 1;
        }
        static{
            System.out.println("in static blockṇ");
        }
    int id;
    counter(int id){
        this.id = id;
        count++;
        System.out.println("cunt = " + count);
    }

    public static void main(String[] args) {
        counter c1 = new counter(121);
        counter c2 = new counter(22);
        System.out.println(count);
    }
    
}
