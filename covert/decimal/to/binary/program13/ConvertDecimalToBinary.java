package covert.decimal.to.binary.program13;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		
		int a = 12;
		
		int b = a%2;
		
		int c =a/2;
		
		int i = 0;
		
		int j;
		
		int e[] = new int [30];
		
	while(a>0)
	{
		e[i++] = a%2;
		
		a=a/2;	

	}
	
	for(j=i-1;j>=0;j--)
	{
	System.out.println(a + "  The Binary Value : " + e[i]);
		
	}
	
}
}