package week18.problems.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;



	public class VowelsRecursion 
	{
		@Test
		public void TestCase1()
		{
			int  n = 3;
			int out = Lexicography(n);
			System.out.println(out);
		}

		private int Lexicography(int n) 
		{
			char[] ch = {'a','e','i','o','u'};
			List<String> list = new ArrayList<>();
			recurse(ch, n, 0, "", list);
			return list.size();
		}

		private void recurse(char[] ch, int n, int index, String str, List<String> list) 
		{
			if(str.length() == n)
			{
				list.add(str);
				return;
			}
			for(int i = index; i < ch.length;i++)
			recurse(ch, n,i, str+ch[i], list);
		}	
	}
	
	

