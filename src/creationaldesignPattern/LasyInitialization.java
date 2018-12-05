package creationaldesignPattern;

public class LasyInitialization {
/*Private static member so it gets memory only once	*/
private static LasyInitialization instance;
    
/*It will prevent to instantiate the Singleton class from outside the class.*/
    private LasyInitialization(){}
    
    /*instance will be created at request time  */
    public static LasyInitialization getInstance(){
        if(instance == null)
        {
            instance = new LasyInitialization();
        }
        return instance;
    }

}
/*Note: Not Thread Safe*/