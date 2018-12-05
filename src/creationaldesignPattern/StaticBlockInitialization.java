package creationaldesignPattern;

public class StaticBlockInitialization {
	
	 private static StaticBlockInitialization instance;
	    
	/*It will prevent to instantiate the Singleton class from outside the class.*/
	    private StaticBlockInitialization(){}
	    
	  /* static block initialization for exception handling*/
	    /*Static Block Singletone Class instance will be created at load time*/
	    static
	    {
	        try
	        {
	            instance = new StaticBlockInitialization();
	        }catch(Exception e)
	        {
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }
	    }
	    
	    public static StaticBlockInitialization getInstance(){
	        return instance;
	    }

}
/*Note:Same as early Initialization ...but
 * here  Instance of class is created in the static block that provides option for exception handling.
 * Thread Safe
 */
