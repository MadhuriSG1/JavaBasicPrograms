package com.bridgeit.annotation;

import java.lang.reflect.*;


//Creating annotation  
import java.lang.annotation.*;  


@Retention(RetentionPolicy.RUNTIME)  //refers to the runtime
@Target(ElementType.METHOD)  //Where the annotation can be applied
//declare an annotation.
@interface MyAnnotation1{  
int value();  //annotation that has one me value so its single value annotation
}  

	

//Applying annotation  
class Hello{  
@MyAnnotation1(value=10)  
public void sayHello(){System.out.println("hello annotation");}  
}  

  


public class AnnotationAppliedOnMethod {
	
	//Accessing annotation  
  
    public static void main(String args[])throws Exception{  
      
    Hello h=new Hello();  
    Method m=h.getClass().getMethod("sayHello");  
      
    MyAnnotation1 an=m.getAnnotation(MyAnnotation1.class);  
    System.out.println("value is: "+an.value());  
    }
    }  


