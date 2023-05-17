interface A
{
    int a =9;
    void show();
}
interface B
{ int a=10;
    void abc();
}
class c implements A,B{
    public void show(){
        System.out.println("in show");
    }
    public void abc(){
        System.out.println("in abc");
    }

}
public class dem0Intr {
    public static void main(String[] args) {
        
        c c1=new c();
        c1.show();
        c1.abc();
        //System.out.println(c1.a);-->CE ambuguity field a is
        System.out.println("--------------");
         A a = c1;
       a.show();
        System.out.println(A.a);
    //     //a.abc();-->CE
         System.out.println("---------------------------");
           B b = c1;
           System.out.println(B.a);
    //     //b.show();-->CE
            b.abc();

    }
    
}
