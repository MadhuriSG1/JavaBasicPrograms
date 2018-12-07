package creationaldesignPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*The problem with above serialized singleton class is that whenever we deserialize it, 
 * it will create a new instance of the class.it destroys the singleton pattern,so readResolve() method is used*/
public class SerializationSingletoneTest {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
	        DeserializedusingreadResolve instanceOne = DeserializedusingreadResolve.getInstance();
	        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
	                "filename.ser"));
	        out.writeObject(instanceOne);
	        out.close();
	        
	        //deserailize from file to object
	        ObjectInput in = new ObjectInputStream(new FileInputStream(
	                "filename.ser"));
	        DeserializedusingreadResolve instanceTwo = (DeserializedusingreadResolve) in.readObject();
	        in.close();
	        
	        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
	        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
	        
	    
    }

}
 