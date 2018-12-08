package com.bridgeit.reflectionExp;

import java.lang.reflect.*;

public class AccessClass{  
 public static void main(String args[]) throws Exception{  
  Class<?> c1=Class.forName("com.bridgeit.reflectionExp.Test");  
  System.out.println(c1.getSimpleName());  
  System.out.println(c1.getName());  
 }  
}  