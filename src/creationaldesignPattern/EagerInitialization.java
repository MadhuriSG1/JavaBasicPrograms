package creationaldesignPattern;

public class EagerInitialization {

	/*Early instance will be created at load time*/
private static final EagerInitialization instance = new EagerInitialization();
    
/*It will prevent to instantiate the Singleton class from outside the class.*/
    private EagerInitialization(){}
    
    /* It provides globaly to singleton object &returns the instance to caller*/
    public static EagerInitialization getInstance(){
        return instance;
    }

}
/*Drawback: 1)drawback that instance is created 
 * even though client application might not be using it. 
 *2) also this method doesn’t provide any options for exception handling.
 *3)The client application can’t pass any argument,
 * Adv: Thread safe*/
 