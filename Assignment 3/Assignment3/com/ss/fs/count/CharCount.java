package com.ss.fs.count;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Objects;
import java.util.Scanner;
import java.io.IOException;

public class CharCount {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		Integer count = 0;
		
		System.out.print("Please enter the file you would like to search: ");
		String path = sc.next();
		f = new File(path);
		
		System.out.print("Please enter the letter you would like to count: ");
		char target = sc.next().charAt(0);
		
		try 
		{
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String s = null;
			
			do 
			{
				s = br.readLine();
				for (char c: s.toCharArray())
				{
					if (target == c)
					{
						count++;
					}
				}
			} while (br.readLine() != null);
			
			System.out.println("The number of occurrences of the specified char (" + target + ") is: " + count);
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("The specified file does not exist.");
		}
	}

}
