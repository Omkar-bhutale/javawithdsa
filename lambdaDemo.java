interface car{
    void drive();
}


class lambdaDemo{
    // public static void main(String[] args) {
    //     car obj = new car(){
    //         public void drive(){
    //             System.out.println("driving  ..");
    //         }
    //     };
    //     obj.drive();
    // }
    public static void main(String[] args){
        car obj=()->System.out.println("driving");
        obj.drive();
    }

}