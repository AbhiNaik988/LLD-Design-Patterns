package Design_Patterns.Creational_Patterns.Singleton_Pattern;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    public static void main(String[] args) {
        //Single Thread
        Bike bike1 = Bike.getInstance();
        Bike bike2 = Bike.getInstance();

        //Multithreading
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> {CarMulti.getInstance();});
        executorService.execute(() -> {CarMulti.getInstance();});
    }
}
