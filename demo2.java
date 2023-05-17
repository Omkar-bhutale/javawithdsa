abstract class Engine{
    public abstract void engineType();
}
class Vehicle{
    public void transport(Engine e){
        e.engineType();
    }
}
public class demo2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.transport(new Engine() {
            @Override
            public void engineType(){
                System.out.println("tourbo engine");
            }
        });
    }
    
}
