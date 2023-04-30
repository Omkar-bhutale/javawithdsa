class parant{
    void print(){
        System.out.println("parant");
    }
}
class  subclass1 extends parant{
    void print(){
        System.out.println("subclass1");
    }
}
class subclass2 extends subclass1{
    void print(){
        System.out.println("subclass2");
    }
}

public class overriding {
    public static void main(String[] args) {
        parant a;
        a=new subclass1();
        a.print();
        a=new subclass2();
        a.print();
    }
    
}
