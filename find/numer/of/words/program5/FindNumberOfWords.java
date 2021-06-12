package find.numer.of.words.program5;

public class FindNumberOfWords {

	public static void main(String[] args) {
		
		int f=3;
		
		String a[] = {"aa","b","cc","ddd"};
		
		int str = a[0].length();
		
		int str1 = a[1].length();
		
		int str2 = a[2].length();
		
		int str3 = a[3].length();
		
		if(f==1)
		{
			System.out.println("Output 1 : " + str1);
		}
		else
			if(f==2)
			{
				System.out.println("Output 2 : " + (str+str2));
			}
			else
				if(f==3)
				{
					System.out.println("Output 1 : " + str3);
				}	
		
	}

}
