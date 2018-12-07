package creationaldesignPattern;

import java.io.Serializable;


public class DeserializedusingreadResolve implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private DeserializedusingreadResolve(){}
    
    private static class SingletonHelper{
        private static final DeserializedusingreadResolve instance = new DeserializedusingreadResolve();
    }
    
    public static DeserializedusingreadResolve getInstance(){
        return SingletonHelper.instance;
    }
    
   /*when we deserialize creating new instance of class so hashcode different
    *  After adding readResolve method notice that hashCode of both the instances are same in test program. 
    * so it will avoid to destroy singletone Pattern*/
protected Object readResolve() {
    return getInstance();
}
    
}