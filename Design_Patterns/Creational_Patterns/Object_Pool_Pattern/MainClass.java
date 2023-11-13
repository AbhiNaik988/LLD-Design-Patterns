package Design_Patterns.Creational_Patterns.Object_Pool_Pattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    public static void main(String[] args) {
        DogPool dogPool = new DogPool(5);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> {
            Dog dog1 = null;
            Dog dog2 = null;
            Dog dog3 = null;
            try {
                dog1 = dogPool.getDog();
                dog2 = dogPool.getDog();
                dog3 = dogPool.getDog();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(dog1);
            System.out.println(dog2);
            System.out.println(dog3);
            System.out.println(dogPool);
        });

        executorService.execute(() -> {
            Dog dog1 = new Dog("bruno","-");
            Dog dog2 = new Dog("Moti","-");
            dogPool.releaseDog(dog1);
            dogPool.releaseDog(dog2);
            System.out.println(dogPool);
        });

        executorService.execute(() -> {
            Dog dog3 = new Dog("lebron","-");
            Dog dog4 = new Dog("james","-");
            dogPool.releaseDog(dog3);
            dogPool.releaseDog(dog4);
            System.out.println(dogPool);
        });

        executorService.close();

    }
}
