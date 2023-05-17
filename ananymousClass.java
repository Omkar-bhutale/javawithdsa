interface Eatable{
    void eat();
}

public class ananymousClass {
    public static void main(String[] args) {
        Eatable e = new Eatable() {
           public void eat(){
                System.out.print("nice fruits");
            }
        };
        e.eat();
      //  A class is created, but its name is decided by the compiler, which implements the Eatable interface and provides the implementation of the eat() method.

       
// class ananymousClass$1 implements Eatable {
  
//     ananymousClass$1() {
//     }
    
//     public void eat() {
  //void eat(){System.out.println("nice fruits");  
//     }
//   }
    
    }
    
}
