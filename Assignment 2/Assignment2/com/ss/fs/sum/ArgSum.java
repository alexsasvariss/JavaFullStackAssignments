package com.ss.fs.sum;

public class ArgSum {

	public static void main(String[] args) {
		Double sum = 0.0;
		for (String a: args)
		{
			try
			{
				sum += Double.parseDouble(a);
			}
			catch (Exception e)
			{
				System.out.println(a + " is not a number.");
			}
		}
		System.out.println("The sum of the number value args is: " + sum);
	}

}
