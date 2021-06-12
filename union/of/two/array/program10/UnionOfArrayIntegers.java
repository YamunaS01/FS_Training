package union.of.two.array.program10;

public class UnionOfArrayIntegers {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4};
		int [] b = {3,4,5,6};
		
		int[] c = new int [20];
		
		int len1 = a.length;
		
		int len2 = b.length;
				
		int j;
		int f;
		int i;
		int k=0;
		
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
			System.out.println("Union of two array  " + c[i]);
		
			
	}
	}
}
