package singleton;

public class UseSingleton {

    private static UseSingleton instance;

    private UseSingleton(){

    }

    public static UseSingleton getInstance(){
        if (instance == null) {
            instance=new UseSingleton();
        }
        return instance;
    }
}
