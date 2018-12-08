package com.bridgeit.reflectionExp;

import java.lang.reflect.*;

public class AccessPrivateMethod {

	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.bridgeit.reflectionExp.Test");
		Test t=(Test)c.newInstance();
		Method m=c.getDeclaredMethod("show", null);
		m.setAccessible(true);
		m.invoke(t, null);
	

	}

}
