package com.ss.fs.lambda;

public class LambdaSortImpl {

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
		
		
		
		
	}

}









