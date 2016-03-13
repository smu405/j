package headfirst.singleton.threadsafe;

public class Singleton {
    private static Singleton uniqueInstance;
    private static int numCalled=0;
 
    // other useful instance variables here
 
    private Singleton() {}
 
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        System.out.println("numCalled: "+numCalled++);
        return uniqueInstance;
    }
 
    // other useful methods here
}
