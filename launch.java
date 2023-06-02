package CollectionFramework;

import java.util.Iterator;

class OurGenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public OurGenericList() {
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T item) {
        this.items[size++] = item;
    }

    public T getItemAtIndex(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {

        return new OurGenericListIterator(this);

    }

    private class OurGenericListIterator implements Iterator
    {
    private OurGenericList<T> list;
    private int index =0;
    public OurGenericListIterator(OurGenericList<T> list){
        this.list=list;
    }

        @Override
        public boolean hasNext() {
          //  System.out.println("in has next");
            return index<list.size;

        }

        @Override
        public Object next() {
           // System.out.println("in next");
            return list.items[index++];
        }


}
}

    public class launch {
        public static void main(String[] args) {
            OurGenericList<Integer> list = new OurGenericList<>();
            list.add(121);
            // Integer in = list.getItemAtIndex(0);
            // System.out.println(in);
            list.add(123);
            list.add(125);

            // Iterator<Integer> itr = list.iterator();
            // while (itr.hasNext()) {
            //     System.out.println(itr.next());
            // }
            for(Integer i : list){
                System.out.println(i);
            }

        }

}
