package com.ss.fs.append;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppendToText {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the file path you would like to append to: ");
		String path = sc.next();
		
		try(FileWriter fw = new FileWriter(path, true); //Set to true to be in append mode
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);)
		{
			System.out.print("Enter the text you would like to append: ");
			String input = sc.next();
			pw.print(input);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
