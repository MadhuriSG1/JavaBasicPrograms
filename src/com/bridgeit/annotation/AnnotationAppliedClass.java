package com.bridgeit.annotation;

import java.lang.annotation.*;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)//metaAnnotation
@interface SmartPhone
{
	String oS() default "iphone";
	int version() default 5;
}

@SmartPhone(oS = "Android", version = 6)
class NokiaSeries
{
	String model;
	int size;
	public NokiaSeries(String model, int size) {

		this.model = model;
		this.size = size;
	}
	
}

public class AnnotationAppliedClass {
@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		NokiaSeries obj=new NokiaSeries("Fire", 5);
		//System.out.println(obj.model); //here we get NokiaSeries model i.e. Fire
		//but we have to check is it smartphone or not
		
		@SuppressWarnings("rawtypes")
		Class c=obj.getClass();
		//System.out.println(c);//we get class NokiaSeries
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone)an;
		System.out.println("OS is : "+s.oS());  
		System.out.println("Version is : "+s.version());  
		
		//System.out.println();
	}

}
