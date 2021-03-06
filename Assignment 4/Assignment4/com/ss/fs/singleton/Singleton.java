package com.ss.fs.singleton;

public class Singleton {

	private static volatile Singleton instance;
	
	private Singleton()
	{
		System.out.println("New instance created!");
	}
	
	public static Singleton getInstance()
	{
		if (instance == null)
		{
			synchronized (Singleton.class)
			{
				if (instance == null)
				{
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}

}
