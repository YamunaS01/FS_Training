package covert.string.array.to.string.program5;

public class CovertStringArrToString {

	public static void main(String[] args) {
	
		String [] str = {"Vikas", "Lokesh", "Ashok"};
		
		String str1 = str[0];
		String str2 = str[1];
		String str3 = str[2];
		String str4 = str1.concat(str2);
		
		System.out.println("String Arry converted to String = " + str4.concat(str3));
		

	}

}
