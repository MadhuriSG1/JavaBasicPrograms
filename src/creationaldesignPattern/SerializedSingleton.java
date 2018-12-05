package creationaldesignPattern;

import java.io.Serializable;


public class SerializedSingleton implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}
    
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    
   /*when we deserialize creating new instance of class so hashcode different
    *  After adding readResolve method notice that hashCode of both the instances are same in test program. 
    * so it will avoid to destroy singletone Pattern*/
protected Object readResolve() {
    return getInstance();
}
    
}