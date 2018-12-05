package creationaldesignPattern;

public class ThreadSafeWithSyncBlock {
	 private static ThreadSafeWithSyncBlock instance;
	    
	    private ThreadSafeWithSyncBlock(){}
	    

public static ThreadSafeWithSyncBlock getInstanceUsingDoubleLocking(){
    if(instance == null){
        synchronized (ThreadSafeWithSyncBlock.class) {//Here only block is synchronized
            if(instance == null){
                instance = new ThreadSafeWithSyncBlock();
            }
        }
    }
    return instance;
}
}

/*Pros:

    Thread safety is guaranteed
    Client application can pass arguments
    Lazy initialization achieved
    Synchronization overhead is minimal and applicable only for first few threads when the variable is null.

Cons:

    Extra if condition*/
