package Design_Patterns.Behavioural_Patterns.Iterator_Pattern;

import java.util.Arrays;

public class MyCustomList implements Iterable {
    private int[] arr;
    private int index;

    public MyCustomList(int size){
        this.arr = new int[size];
        this.index = 0;
    }

    public void add(int ele){
        this.arr[index++] = ele;
    }

    public void remove(int ele){
        int index = -1;
        for(int i = 0;i<this.arr.length;i++){
            if(arr[i] == ele){
                index = i;
            }
        }

        if(index == -1){
            System.out.println("No such element");
        }
        else{
            for(int k=index;k<this.arr.length - 1;k++){
                this.arr[k] = this.arr[k+1];
            }
        }
    }

    public void printList(){
        System.out.println(Arrays.toString(this.arr));
    }

    @Override
    public Iterator getIterator() {
        return new MyCustomIterator(this.arr);
    }
}
