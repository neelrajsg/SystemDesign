package Singleton;

public class Singleton {

    // Prevents other classes from creating objects directly
    private Singleton() {
    }

    // Holds the single object
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    // Provides access to the single object
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton.Singleton!");
    }
}