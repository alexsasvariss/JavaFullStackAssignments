package com.ss.fs.datetimeapi;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class FridayImpl {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the month: ");
		String raw_month = sc.next();
		Integer raw_day = null;
		Month m = null;
		LocalDate d = null;
		
		System.out.print("Please enter the day: ");
		try
		{
			raw_day = sc.nextInt();
		}
		catch (Exception e)
		{
			System.out.println("Not a valid day. ");
			System.exit(1);
		}
		
		try
		{
			m = Month.valueOf(raw_month.toUpperCase());
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Invalid month.");
			System.exit(1);
		}
		
		try
		{
			d = Year.now().atMonth(m).atDay(raw_day);
		}
		catch (DateTimeException e)
		{
			System.out.println("Invalid date.");
			System.exit(1);
		}
		
		
		System.out.println(d.query(new FridayQuery()));
	}
	
	
}
