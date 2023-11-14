package Design_Patterns.Behavioural_Patterns.Iterator_Pattern;

import java.util.NoSuchElementException;

public class MyCustomIterator implements Iterator{
    private int[] arr;
    private int index;

    public MyCustomIterator(int[] arr){
        this.arr = arr;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < arr.length;
    }

    @Override
    public int next() {
        if(hasNext()){
            return arr[index++];
        }
        return 0;
    }
}
