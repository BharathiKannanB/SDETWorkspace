package week12.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsCount {

	public static void main(String[] args) {
		
		String s = "jds dsaf lk,df kdsa fkldsf, adsbf ld.ka ads? asd bfd-al ds bf[l. akf dhj- ds 878 dwa WE DE 7475 dsfh ds RAMU 748 dj";
        String[] arr = s.split(" ");
        int  i=0;
        List<String> output = new ArrayList<String>();
        output = Arrays.asList(arr);
        for(String temp :output)
        {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        //Pattern pattern2 = Pattern.compile("[a-zA-Z]");
        Matcher match = pattern.matcher(temp);
       // Matcher match2 = pattern2.matcher(temp);
        char last = temp.charAt(temp.length() -1);
        if(match.find())
        {
        	System.out.println(temp);
        	i++;
        }
        else if(last==','||last=='.'||last=='?'||last=='!'||temp.indexOf('-')>0)
        {
        	i++;
        }
       }
        System.out.println(i);
        
}
}
