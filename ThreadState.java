package CollectionFramework;


public class ThreadState {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{try{
            Thread.sleep(1);
            for(int i =0;i<10000;i++);
        }catch(Exception e){
            e.printStackTrace();
        }
    },"states");
    t1.start();
    while(true){
        Thread.State state = t1.getState();
        System.out.println(state);
        if(state==Thread.State.TERMINATED) break;
    }
    }
    
}
