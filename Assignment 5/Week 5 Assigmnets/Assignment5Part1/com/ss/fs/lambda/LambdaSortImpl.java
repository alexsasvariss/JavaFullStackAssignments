package com.ss.fs.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaSortImpl {
	public static void printArray(String[] arr)
	{
		for (String s : arr)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		
		LambdaSortInt sort_len = (strings) -> {
			Integer i, j;
			String key;

			for (i = 1; i < strings.length; i++)
			{
				key = strings[i];
				j = i - 1;
				
				while (j >= 0 && strings[j].length() > key.length())
				{
					strings[j + 1] = strings[j];
					j = j - 1;
				}
				strings[j + 1] = key;
			}
			return strings;
		};
		
		LambdaSortInt sort_rev_len = (strings) -> {
			Integer i, j;
			String key;

			for (i = 1; i < strings.length; i++)
			{
				key = strings[i];
				j = i - 1;
				
				while (j >= 0 && strings[j].length() < key.length())
				{
					strings[j + 1] = strings[j];
					j = j - 1;
				}
				strings[j + 1] = key;
			}
			return strings;
		};
		
		LambdaSortInt sort_alphabetical = (strings) -> {
			Integer i, j;
			String key;

			for (i = 1; i < strings.length; i++)
			{
				key = strings[i];
				j = i - 1;
				
				while (j >= 0 && strings[j].charAt(0) > key.charAt(0))
				{
					strings[j + 1] = strings[j];
					j = j - 1;
				}
				strings[j + 1] = key;
			}
			return strings;
		};
		
		LambdaSortInt sort_e = (strings) -> {
			Integer i = 0;
			Integer j = strings.length - 1;
			
			while (i < j)
			{
				while (i < j && (strings[j].charAt(0) != 'e'))
				{
					j--;
				}
				if (strings[i].charAt(0) != 'e')
				{
					String temp = strings[i];
					strings[i] = strings[j];
					strings[j] = temp;
				}
				i++;
			}
			return strings;
			
		};
		
		String[] strings = {"alpha", "beta", "gamma", "delta", "epsilon"};
		
		String[] len_sorted = sort_len.sort(strings);
		System.out.println("-----Sorted by length-----");
		printArray(len_sorted);
		
		String[] rev_len_sorted = sort_rev_len.sort(strings);
		System.out.println("-----Sorted by reverse length-----");
		printArray(rev_len_sorted);
		
		String[] alpha_sorted = sort_alphabetical.sort(strings);
		System.out.println("-----Sorted by alphabetical-----");
		printArray(alpha_sorted);
		
		String[] e_sorted = sort_e.sort(strings);
		System.out.println("-----Sorted by e-----");
		printArray(e_sorted);
	}

}









