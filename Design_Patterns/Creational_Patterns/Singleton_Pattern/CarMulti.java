package Design_Patterns.Creational_Patterns.Singleton_Pattern;

public class CarMulti {
    private static CarMulti carMulti = null;
    private CarMulti(){
        System.out.println("car created!");
    }
    public static CarMulti getInstance(){

        if(carMulti == null){
            synchronized (CarMulti.class){
                if(carMulti == null){
                    carMulti = new CarMulti();
                }
            }
        }
        return carMulti;
    }
    //We can make the whole method synchronized but that is not necessary.
    //Because we just have to make sure that 'new' statement only access by one thread at a time.
    //But we have to double check the carMulti is null before and after the synchronized block.
    //Because when one tread is inside the synchronized block. other thread is just stuck at synchronized block and it has already passed
    //the if condition. When the first thread leave the block second thread is already inside the synchronized block and passed through
    //if statement so it again create new object.
    //To prevent that, we have to double check that carMulti is null.
}
