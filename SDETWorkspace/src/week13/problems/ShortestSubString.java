package week13.problems;

import java.util.HashMap;

public class ShortestSubString {
	public static void main(String[] args)  
	{ 
		String s = "bab";
		System.out.println(minWindow(s));
	}
	
		public static int minWindow(String s) {
			String t="";
			for (int i = 0; i < s.length(); i++){
	            if (t.indexOf(s.charAt(i)) == - 1){
	               t = t + s.charAt(i);
	         }
	      }
			
		    if(s == null || s.length() < t.length() || s.length() == 0){
		        return 0;
		    }
		    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		    for(char c : t.toCharArray()){
		        if(map.containsKey(c)){
		            map.put(c,map.get(c)+1);
		        }else{
		            map.put(c,1);
		        }
		    }
		    int left = 0;
		    int minLeft = 0;
		    int minLen = s.length()+1;
		    int count = 0;
		    for(int right = 0; right < s.length(); right++){
		        if(map.containsKey(s.charAt(right))){
		            map.put(s.charAt(right),map.get(s.charAt(right))-1);
		            if(map.get(s.charAt(right)) >= 0){
		                count ++;
		            }
		            while(count == t.length()){
		                if(right-left+1 < minLen){
		                    minLeft = left;
		                    minLen = right-left+1;
		                }
		                if(map.containsKey(s.charAt(left))){
		                    map.put(s.charAt(left),map.get(s.charAt(left))+1);
		                    if(map.get(s.charAt(left)) > 0){
		                        count --;
		                    }
		                }
		                left ++ ;
		            }
		        }
		    }
		    if(minLen>s.length())  
		    {  
		        return 0;  
		    }  
		    
		    return s.substring(minLeft,minLeft+minLen).length();
		}

}
