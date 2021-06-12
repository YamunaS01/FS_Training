package sum.maximum.and.minium.num.program3;

public class SumOfMaxMinNum {

	public static void main(String[] args) {
	
		int[] arr= {19,17,12};
		
		int a = arr[0];
		
		int b = arr[1];
		 
		int c = arr[2];
		
		int min = 0;
		int max =0;
		int sum = 0;
		
		switch(sum)
		{
		case 0:
			if(a>b)
			{
			max=a;
			min=b;
			}
		case 1:
			if(b>c)
			{
			min=c;
			}
		break;
		 
	}
		 sum = max+min;
		System.out.println("Maximum Number =" + max);
		System.out.println("Minimum Number =" + min);
		System.out.println("Sum of Minimum and Maximum =" + sum);
	}
}
