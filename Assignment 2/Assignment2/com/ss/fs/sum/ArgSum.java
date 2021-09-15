package com.ss.fs.sum;

public class ArgSum {

	public static void main(String[] args) {
		Double sum = 0.0;
		StringBuffer sumStrings = new StringBuffer();
		for (String a: args)
		{
			try
			{
				sum += Double.parseDouble(a);
			}
			catch (Exception e)
			{
				sumStrings.append(a);
			}
		}
		System.out.println("The sum of the number value args is: " + sum);
		System.out.println("The concatenated version of the string args is: " + sumStrings);
	}

}
