package Design_Patterns.Creational_Patterns.Object_Pool_Pattern;

import java.util.LinkedList;
import java.util.Queue;

public class DogPool {
    private static Queue<Dog> dogPool = null;
    private static int maxPoolSize = 0;

    public DogPool(int size){
        dogPool = new LinkedList<>();
        maxPoolSize = size;
    }

    public synchronized Dog getDog() throws InterruptedException {
        while(dogPool.isEmpty()){
            System.out.println("Calling wait method...."+dogPool.size());
            wait();
        }
        System.out.println("getting dog.....");
        return dogPool.poll();
    }

    public synchronized void releaseDog(Dog dog){
        System.out.println("notify all threads....");
        notifyAll();
        if(dogPool.size() < maxPoolSize){
            System.out.println("releasing dog...."+dog.toString());
            dogPool.offer(dog);
        }
    }
}
