package week18.problems.revision;

import java.util.Arrays;

import org.junit.Test;

public class TwoSortedArray {
	@Test
	public void scenario1()
	{
		int[] a = {3,6,9};
		int[] b = {8,7,5};
		System.out.println(Arrays.toString(twoSortedArraySol(a, b)));
	}

	private int[] twoSortedArraySol(int[] a, int[] b)
	{
		int asize=a.length,bsize=b.length,astart,bstart,count=0,adir,bdir;
		int[] output = new int[asize+bsize];
		if(a[0]<a[asize-1]) { astart=0;adir=0;} 
		else {astart=asize-1;adir=1;}
		if(b[0]<b[bsize-1])  { bstart=0;bdir=0;}  
		else {bstart=bsize-1;bdir=1;}
		while(count<asize+bsize )
		{
			if(a[astart]<=b[astart])
				if(adir==0)
				{output[count++]=a[astart++];if(astart>=asize-1) astart=asize-1;}
				else
				{output[count++]=a[astart--];if(astart<0) astart=0;}	
			else if(a[astart]<=b[astart])
				if(bdir==0)
				{output[count++]=b[bstart++];if(bstart>=bsize-1) bstart=bsize-1;}
				else
				{output[count++]=b[bstart--];if(bstart<0) bstart=0;}
	
			//break;
			
		}
		return output;
	
	}
	
	

}
