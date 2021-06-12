package intersection.of.two.array.program11;

public class IntersectionOfTwoArrays {

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
			c[k]=b[i];
			k++;
		}
		}
		
		for (i=0;i<k;i++)
		{
			System.out.println("Intersection of two arrays  " + c[i]);
		
			
	}
	}
}

