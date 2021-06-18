package compare.two.strings.week2.program16;

public class CompareTwoStrings {

	public static void main(String[] args) {
		
		int i;
		
		int j;
		
		int f;
		
		String str1 = "New York";
		
		String str2 = "New Jersey";
		
		String str3 = str1;
		
		char s1[] = str1.toCharArray();
		
		char s2[] = str2.toCharArray();
		
		char s3[] = str3.toCharArray();
		
         int len1 = s1.length;
		
		 int len2 = s2.length;
		
		for(j=0; j<len1 ;j++)
		{
			f=0;
			
			for(i=0; i<len2; i++)
			{
				if(s2[i]==s1[j])
				{
				f=1;
				}
			}
			
			if(f==0)
			{
				s3[j]= '+';
				
			}
			
		}
		
		for(i=0; i<len1; i++)
		{
			System.out.println("Intersection of two array : " + s3[i]);
		}
			
		
		
		
		
	}

}
