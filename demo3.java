abstract class emp{
    void dis(){
        System.out.print("emp maim claass");
    }
    abstract void abstract_method();
}
class demo3 {
    public static void main(String[] args) {
        emp ob = new emp(){
            @Override
            public void dis(){
                System.out.println("msg from child");
            }
            @Override
            void abstract_method(){
                System.out.println("abstract method");
            }
        };
        ob.abstract_method();
        ob.dis();
    }
    
}
