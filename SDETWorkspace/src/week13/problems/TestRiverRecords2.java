package week13.problems;

public class TestRiverRecords2 {

	
	
		
		static int maxDiff (int arr[])  
		{   
			int listsize=arr.length;
		    int difference = arr[1] - arr[0];  
		    int activesum = difference;  
		    int maxsum = activesum;  
		  
		    for(int i = 1; i < listsize - 1; i++)  
		    {  
		    	difference = arr[i + 1] - arr[i];  	  
		        if (activesum > 0)  
		        	activesum += difference;  
		        else
		        	activesum = difference;  
		        if (activesum > maxsum)  
		        	maxsum = activesum;  
		    }  	  
		    return maxsum;  
		}  
		  
		// Driver Code 
		public static void main(String[] args)  
		{  
		//int arr[] = {2, 3, 10, 2, 4, 8, 1}; 
		int arr[] = {7, 3, 5, 6, 9, 2};  
		int n = arr.length;  
		      
		// Function calling  
		System.out.print("Maximum difference is " +  
		                          maxDiff(arr));  
		} 
		
	
}
