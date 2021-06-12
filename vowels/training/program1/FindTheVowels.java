package vowels.training.program1;

public class FindTheVowels {

	public static void main(String[] args) {
		
		char [] z = {'a', 'e', 'i' , 'o', 'u'};
		
		String s = "NewyorkE";

        int Count = 0;
        
        int j=0;
		
	   int len = z.length;
	   
	for(int i=0;i<len;i++)
	   {		
			if(s.charAt(j)==z[i])
		{
			Count++;			
		}	
			j++;
		}
	System.out.println("Vowel count :" + Count);	
		}
		}