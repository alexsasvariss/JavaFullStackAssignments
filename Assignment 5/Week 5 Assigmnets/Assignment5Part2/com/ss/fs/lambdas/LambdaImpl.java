package com.ss.fs.lambdas;

public class LambdaImpl {
	
	public static void main(String[] args)
	{
		LambdaInt isOdd = (val) -> val % 2 == 1 ? true : false;
		LambdaInt isEven = (val) -> val % 2 == 0 ? true : false;
		LambdaInt isPrime = (val) -> {
			boolean flag = true;
			for (Integer i = 2; i <= val; ++i)
			{
				if (val % i == 0)
				{
					flag = false;
					break;
				}
			}
			return flag;
		};
		LambdaInt isPalindrome = (val) -> {
			Integer r, sum = 0, temp;
			temp = val;
			while (val > 0)
			{
				r = val % 10;
				sum = (sum * 10) + r;
				val = val/10;
			}
			return (temp==sum);
		};
		
		
	}
}
