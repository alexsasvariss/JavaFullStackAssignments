package com.ss.fs.lambdas;

import java.util.Scanner;

public class LambdaImpl {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Integer numOfTests = sc.nextInt();
		Integer[][] tests = new Integer[numOfTests][2];
		
		for (Integer i = 0; i < numOfTests; i++)
		{
			for (Integer j = 0; j < 2; j++)
			{
				tests[i][j] = sc.nextInt();
			}
		}
		
		for (Integer test_no = 0; test_no < numOfTests; test_no++)
		{
			switch (tests[test_no][0])
			{
				case 1:
					LambdaInt isOdd = (val) -> val % 2 == 1 ? true : false;
					Boolean checkOdd = isOdd.check(tests[test_no][1]);
					if (checkOdd) System.out.println("ODD");
					else System.out.println("EVEN");
					break;
				case 2:
					LambdaInt isPrime = (val) -> {
						if (val <= 1) return false;
						for (Integer i = 2; i < val; i++)
						{
							if (val % i == 0) return false;
						}
						return true;
					};
					Boolean checkPrime = isPrime.check(tests[test_no][1]);
					if (checkPrime) System.out.println("PRIME");
					else System.out.println("COMPOSITE");
					break;
				case 3:
					LambdaInt isPalindrome = (val) -> {
						String string_val = String.valueOf(val);
						String rev_val = "";
						for (Integer i = string_val.length()-1; i >= 0; i--)
						{
							rev_val = rev_val + string_val.charAt(i);
						}
						return (string_val.equals(rev_val));
					};
					Boolean checkPalindrome = isPalindrome.check(tests[test_no][1]);
					if (checkPalindrome) System.out.println("PALINDROME");
					else System.out.println("NOT PALINDROME");
					break;
			}
		}
		
	}
}
