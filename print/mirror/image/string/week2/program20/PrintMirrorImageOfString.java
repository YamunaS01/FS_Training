package print.mirror.image.string.week2.program20;

public class PrintMirrorImageOfString {

	public void getImage(String str) {

		String word = str;
		
		String output = " ";

		for (int i = word.length() - 1; i >= 0; i--) 
		{
			output += word.charAt(i);
		}
		
		System.out.println(word + "|" + output);
	}
}
