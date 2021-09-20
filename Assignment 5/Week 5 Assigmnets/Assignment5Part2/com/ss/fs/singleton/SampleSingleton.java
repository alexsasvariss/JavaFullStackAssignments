package com.ss.fs.singleton;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SampleSingleton {
	private static Connection conn = null;
	private static volatile SampleSingleton instance = null;
	
	public static SampleSingleton getInstance()
	{
		synchronized (SampleSingleton.class)
		{
			if (instance == null)
			{
				instance = new SampleSingleton();
			}
		}
		return instance;
	}
}
