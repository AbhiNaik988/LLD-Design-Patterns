package Design_Patterns.Behavioural_Patterns.Iterator_Pattern;

public class MainClass {
    public static void main(String[] args) {
        MyCustomList myList = new MyCustomList(5);
        myList.add(2);
        myList.add(4);
        myList.add(6);
        myList.add(8);

        Iterator iterator = myList.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
