class studant{
    int age=5;
    static String school;
    static{
        school="pw";
    }
    public void show(){
        System.out.println("in show"+age+" "+school);
    }
     public static void dis(){
        System.out.println("studying");
     }
}
class demo{
    static{
        System.out.println("in stsatic block");}
        public static void main(String[] args) {
            System.out.println("in main method");
            studant s1 =new studant();
            studant.dis();
            s1.age = 19;
            s1.school="pw skills";
            studant s2=new studant();
            System.out.println(s2.school);
            s1.show();
            s2.show();ih


        }
    }

