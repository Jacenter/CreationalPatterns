package designpatterns.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        //this will return the instance of MySingleton that we created in the MySingleton class
        MySingleton instance = MySingleton.getInstance();
        //verify with a system out to return the object address
        System.out.println(instance);
        /*we can make sure its a singleton because if we print out the instance again under a different reference name
        it should return the same address
         */
        MySingleton anotherInstance = MySingleton.getInstance();
        System.out.println(anotherInstance);
    }
}
