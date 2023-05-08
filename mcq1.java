class mcq1 {
    static int i;
    static int j;
    static{
        i=15;
        j=i-5;
    }
    public static void main(String[] args) {
        int i=0;
        test a = null;
        for(;i<3;i++){
            a=new test();
            a.i=mcq1.i;
            mcq1.i+=a.add(a.operate(i));

        }
        System.out.println(mcq1.i+" "+mcq1.j+" "+i+" "+a.i+" ");
    }
}
class test {
    int i =0;
    int operate(int i){
        if(mcq1.j-i ==i*i*i){
            return -i;
        }
        else{
            return i*i;
        }
    }
    int add(int i){
        return this.i+i;
    }
}