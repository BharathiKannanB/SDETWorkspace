package week2.string;

public class TestRiverRecords {

	public static void main(String[] args) {
	
		
		int[] arr = {5,3,6,7,4};
		int temp, max=0;
		for(int i=arr.length-1;i>0;i--)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i]-arr[j];
					if(temp>max)
						max=temp;
				}
			}
		}
	System.out.println(max);
	}

}
