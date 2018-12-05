package creationaldesignPattern;

public class ThreadSafeWithSychMethod {
	
	 private static ThreadSafeWithSychMethod instance;
	    
	    private ThreadSafeWithSychMethod(){}
	    
	  //Here methods is synchronized
	    public static synchronized ThreadSafeWithSychMethod getInstance(){
	        if(instance == null){
	            instance = new ThreadSafeWithSychMethod();
	        }
	        return instance;
	    }

}
/*Adv:
    Thread safety is guaranteed.
    Client application can pass parameters
    Lazy initialization achieved
 Dis:
    Slow performance because of locking overhead.
    Unnecessary synchronization of whole method that is not required once the instance variable is initialized.
    which increses CPU cycles*/
