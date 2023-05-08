//package java_program.static;

public class stticstudant {
  int rollNo;
  String name;
  static String clg = "rsml";
  static void change(){
    clg = "cocsit";
  }
stticstudant(int r,String name){
    rollNo =r;
    this.name=name;
}
void dis(){
    System.out.println("roll ="+ rollNo + "\n NAme "+ name
   + "\nclg name "+ clg);
}
public static void main(String[] args) {
    stticstudant s1 = new stticstudant(11, "omkar");
    s1.dis();
    change();
    s1.dis();
}

}
