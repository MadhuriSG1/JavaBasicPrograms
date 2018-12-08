package com.bridgeit.annotation;

import java.io.UncheckedIOException;
import java.util.ArrayList;

@SuppressWarnings("unused")
class A
{
	public void showMyDataFromDatabase()
	{
		System.out.println("in A");
	}
}

class B extends A
{
	@Override
	//@SuppressWarnings("unchecked")//suppress warnings issued by the compiler.
	//@Override inform programmer this method is override method 
	//and if any spelling mistake it gives compile errors so we can avoide runtime error
	
	@Deprecated // It informs user that it may be removed in the future versions.
	public void showMyDataFromDatabase()//showMyDataFromdatabase
	{
		ArrayList<String> k=new ArrayList<>();
		System.out.println("in B");
        k.add("a");
	}
}
public class OverrideExample {

	public static void main(String[] args) {
		
		B obj=new B();
        obj.showMyDataFromDatabase();
        
	}
@FunctionalInterface
	interface Abc
	{
		void show();
		//void delete();
	}
}
