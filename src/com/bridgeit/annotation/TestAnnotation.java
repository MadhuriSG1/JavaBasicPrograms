package com.bridgeit.annotation;

import java.lang.reflect.Method;

public class TestAnnotation {
	
	//Accessing annotation  
  
    public static void main(String args[])throws Exception{  
      
    Hello h=new Hello();  
    Method m=h.getClass().getMethod("sayHello");  
      
    MyAnnotation manno=m.getAnnotation(MyAnnotation.class);  
    System.out.println("value is: "+manno.value());  
    }
    }  

//Applying annotation  
class Hello{  
@MyAnnotation(value=10)  
public void sayHello(){System.out.println("hello annotation");}  
}  
  

