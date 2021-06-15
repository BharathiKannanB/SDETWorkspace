package week18.problems.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;



	public class BracketsRecursion 
	{
		@Test
		public void TestCase1()
		{
			int  n = 1;
			System.out.println(bracketsol(n));
		}

		private int bracketsol(int n) 
		{
			int left=0, right=0;
			List<String> list = new ArrayList<>();
			recursive(n,left, right, "", list);
			return list.size();
		}

		private void recursive(int n, int left, int right, String str, List<String> list) 
		{
			if(str.length() <= n*2){
				list.add(str);
				//System.out.println(list);
				return;}
			if(left<n)
				recursive(n,left+1,right,"(",list);
			if(right<left)
				recursive(n,left,right+1,")",list);
		}	
	}
	
	

