package com.bridgeit.annotation;


//Creating annotation  
import java.lang.annotation.*;  
import java.lang.reflect.*;  
  
@Retention(RetentionPolicy.RUNTIME)  //refers to the runtime
@Target(ElementType.METHOD)  //Where the annotation can be applied
//declare an annotation.
@interface MyAnnotation{  
int value();  
}  
  
	
   
    

