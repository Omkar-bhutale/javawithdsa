package CollectionFramework;
class CoustonArrayList{
    private int size;
    private int array[];
    private int tar = 0;
    public CoustonArrayList(int size) {
        this.size = size;
        array = new int[size];
    }

    public CoustonArrayList() {
        array = new int[10];
    }

    void add(int data){
        if(isFull()){
            resize();
        }
        array[tar++]=data;
        
    }


    private void resize() {
        int temp[] = new int[(array.length)*10];
        for (int i = 0; i < array.length; i++) {
            temp[i]=array[i];

            
        }
        temp = array;

    }

    private boolean isFull() {
        if(tar==array.length) {return true;}
         return false;
    }
    

    
}
public class LaunchAL3 {
    
}
