package creationaldesignPattern;

public class BillPughUsingInnerStatic {
	
private BillPughUsingInnerStatic(){}
    
//Inner Static class
    private static class SingletonHelper{
        private static final BillPughUsingInnerStatic INSTANCE = new BillPughUsingInnerStatic();
    }
    
    public static BillPughUsingInnerStatic getInstance(){
        return SingletonHelper.INSTANCE;
    }

}
/*Note:When the Main class is loaded, SingletonHelper class is not loaded into memory and only when someone calls the getInstance method, 
this class gets loaded and creates the Singleton class instance.*/

/*Adv:Doesn’t require synchronization. So most widly used*/