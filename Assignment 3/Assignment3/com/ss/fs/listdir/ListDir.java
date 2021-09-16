package com.ss.fs.listdir;

import java.io.File;

public class ListDir {

	public static void main(String[] args) {
		String input = null;
		File path = null;
		
		if (args.length >= 1)
		{
			input = args[0];
		}
		else
		{
			System.out.println("Please enter the directory you would like to print as the first argument of this program in cmd.");
			System.exit(1);
		}
		
		try
		{
			path = new File(input);
		}
		catch (Exception e)
		{
			System.out.println("The specified path does not exist...");
			System.exit(1);
		}
		
		System.out.println(path);
		if (path.isDirectory())
		{
			for (File f: path.listFiles())
			{
				System.out.println(f);
			}
		}

	}

}
