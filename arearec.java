//package java_program.static;

public class arearec {
  int length;
  int breath;
  arearec(int l ,int b){
    length=l;
    breath =b;
  } 
  static int area;

   void area(){
    area=length*breath;
    
  }
  static void areadis(){
    System.out.println("area="+area);
  }
  void dis(){
    System.out.println("length"+length+"breath"+breath);
    area();
    areadis();
  }
  public static void main(String[] args) {
   arearec a1 = new arearec(11, 11);
   a1.dis();
  }
}
