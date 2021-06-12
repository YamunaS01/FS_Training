package union.and.intersection.of.two.array.program12;

public class UnionIntersectionOfTwoArray {

	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		int [] b = {3,4,5,6};
		int [] e = {1,2,3,4,5,6};
		int [] g = {3,4};
		
		int[] c = new int [6];
		
		int[] d = new int [2];
		
		int[] h = new int [10];
		
		int len1 = a.length;
		
		int len2 = b.length;
		
	    int len3 = e.length;
		
		int len4 = g.length;
				
		int j=0;
		int f;
		int i;
		int m=0;
		int n=0;
		int k=0;
		
	// Union of two arrays
		
		for(i=0;i<len1;i++)
		{			
		c[k]=a[i];
		k++;
		}
		
		for(i=0;i<len2;i++)
		{
		f=0;
		for(j=0;j<len1;j++)
		{
			if(b[i]==a[j])
			{
				f=1;
		    }
		}
		if (f==0)
		{
			c[k]=b[i];
			k++;
		}
		}
		
		for (i=0;i<k;i++)
		{
			System.out.println("Union of two array : " + c[i]);
	
	    }
		
	//Intersection of two arrays
		
		for(i=0;i<len2;i++)
		{
		f=0;
		for(j=0;j<len1;j++)
		{
			if(b[i]==a[j])
			{
				f=1;
		    }
		}
		
		if (f==1)	
		{
			d[m]=b[i];
			m++;
		}
		}
		
		for (i=0;i<m;i++)
		{
			System.out.println("Intersection of two array : " + d[i]);
			
	    }
		
		//Difference of union and intersection
		
		for(i=0;i<len3;i++)
		{
		f=0;
		for(j=0;j<len4;j++)
		{
			if(g[j]==e[i])
			{
				f=1;
		    }			
		}
		if(f==0)
		{	
			h[n]=e[i];
			n++;
		}
		}
		
		for (i=0;i<n;i++)
		{
			System.out.println("Difference of two array : " + h[i]);
				
	    }
		
		}
}
