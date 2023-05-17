
interface Bank{  
    float rateOfInterest=11.11f;  
    }  
    class SBI implements Bank{  
    int i=(int)(rateOfInterest);
    //rateOfInterest=12.4; final variable

    public float rateOfInterest(){return 9.15f;}  
    }  
    class PNB implements Bank{  
    public float rateOfInterest(){return 9.7f;}  
    }  
    class exp{  
    public static void main(String[] args){  
    Bank b=new SBI();  
    System.out.println("ROI: "+SBI.rateOfInterest);  
    }} 