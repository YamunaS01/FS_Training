package display.unique.characters.program15;

public class DisplayUniqueCharacters {

	public static void main(String[] args) {

		String s = "helloworld";
		
		char ch[] = new char [s.length()];
		
		for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
		

	}

}
