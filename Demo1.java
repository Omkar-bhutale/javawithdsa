interface software{
    void devlop();
}
class Demo1{
    public static void main(String[] args) {
        software s = new software() {
            @Override
            public void devlop(){
                System.out.println("devlopes in java");
            }
        };
        s.devlop();
        System.out.println(s.getClass());
        System.out.println(s.getClass().getName());

    }

}