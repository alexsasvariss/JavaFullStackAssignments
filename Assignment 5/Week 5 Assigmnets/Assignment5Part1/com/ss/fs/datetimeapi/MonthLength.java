package com.ss.fs.datetimeapi;

import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

public class MonthLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the year: ");
		Integer year = sc.nextInt();

		for (Month m : Month.values())
		{
			YearMonth ym = YearMonth.of(year, m);
			System.out.println("There are " + ym.lengthOfMonth() + " days in the month of " + m + ".");
		}
	}

}
