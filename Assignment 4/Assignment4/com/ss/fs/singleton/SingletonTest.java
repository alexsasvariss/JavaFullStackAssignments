package com.ss.fs.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//Should only see instance created once.
		
		//Extra check to see if they're the same object
		if (s1 == s2)
		{
			System.out.println("Same object.");
		}
		else
		{
			System.out.println("Different objects.");
		}

	}

}
