interface A {
    int a=11;//bydefault the variables are public static final we can not change
    static void show(){
        System.out.println("static mehod are not abstract in interface");
    }
    void dis();//by default the methods are abstract and public

    
}
public class whatIsInter {
    public static void main(String[] args) {
       // A a = new A() ;--->CE since ce can not create an object 
     //  A a;// --> but we can create its refrance type
       System.out.println(A.a);
       A.show();
       A a = ()->System.out.println("in show");
       a.dis();
       //A.dis(); -->CE
    }
    
}
