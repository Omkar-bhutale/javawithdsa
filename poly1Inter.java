interface Polygoan1{
    default void dis(){
        System.out.println("for entring parameter");
    }
    static void display(){
        System.out.println("polygon is for ex rectangle like objects");
    }
    
}
class Rectangle1 implements Polygoan1{
    public void dis(){//overrridrd default methof in inter face
        System.out.println("for entering parametr of rectangle");
    }
    void display(){//method hieding in java
        System.out.println("rectangle is polygoan");
    }

}
class demo implements Polygoan1{

}

class poly1Inter {
    public static void main(String[] args) {
       // Rectangle r = new Rectangle();
       Polygoan1 r1 = new Rectangle1();
       r1.dis();
     //  r1.display(); we can not even reffer ststic mehod of  with refracr var
        Polygoan1.display();
        r1 = new demo();
        r1.dis();
        //r1.display();

    }
    
}
