package com.ss.fs.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Mondays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Month m = null;
		
		System.out.print("Please input the name of the month: ");
		String in = sc.next();
		try {
			m = Month.valueOf(in.toUpperCase());
		} catch (Exception e) {
			System.out.println("That is not a valid month.");
		}
		
		LocalDate date = Year.now().atMonth(m).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		Month current = date.getMonth();
		while (current == m)
		{
			System.out.println(date);
			date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            current = date.getMonth();
		}
	}

}
