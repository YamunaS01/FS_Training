
public class Stringasdf {

	public static void main(String[] args) {
		String testString = "This is a sentence";
		String[] parts = testString.split(" ");
		String lastWord = parts[parts.length - 1];
		System.out.println(lastWord);
	}

}
