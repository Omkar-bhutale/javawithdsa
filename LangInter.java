interface Language{
    void getLanguage(String lname);
}
class PLang implements Language{
    public void getLanguage(String lname){
        System.out.println("name of programing language is =" + lname);
    }
}

class LangInter {
    public static void main(String[] args) {
        String l ="c++";
        PLang p = new PLang();
        p.getLanguage(l);

    }
    
}
