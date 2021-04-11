package designpatterns.singleton;

public class MySingleton {

    //this creates an instance that our application can hold onto and will manage so it only returns one instance
    //this example below is eagerly loaded it creates an instance regardless of it is used
    //private static MySingleton instance = new MySingleton();

    //lazily load the instance

    /*we can make the singleton threadsafe by adding volatile which ensure it remains
    a singleton despite changes inside the JVM
     */
    private static volatile MySingleton instance = null;

    /*Our singleton will have a private constructor
    so that new instances of this class cannot be created
    people cannot use keyword new to create a new instance of this singleton
     */

    private MySingleton(){
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
        /* inside this constructor will handle how the instance is created
         */
    }

    /*this getter is so that the singleton can be
    referenced outside of this class but not created
    this getter will return the instance that we create above
    in the private constructor
     */
    public static MySingleton getInstance() {
        //lazily loaded instance code
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }
}
