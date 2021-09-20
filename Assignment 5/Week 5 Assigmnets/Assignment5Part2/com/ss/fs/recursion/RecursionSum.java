package com.ss.fs.recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionSum {
	
	public static List<Integer> resolveDuplicates(List<Integer> val)
	{
		ArrayList<Integer> processed = new ArrayList<Integer>();
		Integer sum = 0, prev = null;
		for (Integer i : val)
		{
			if (prev == null) 
			{
				prev = i;
				sum = i;
				continue;
			}
			if (i == prev) sum += i;
			else
			{
				processed.add(sum);
				sum = i;
			}
			prev = i;
			
		}
		processed.add(sum);
		return processed;
	}
	
	public static Boolean solve(List<Integer> val, Integer sum, Integer index, Integer target)
	{
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
