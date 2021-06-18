package encrypt.string.week2.program17;

public class EncryptedString {

	public static void main(String[] args) {

		String input = "yelloworld";
		String output = "";
		char ch = ' ';
		int val;

		for (int i = 1; i <= input.length(); i++) {
			if (i % 2 == 0) {
				output += input.charAt(i - 1);
			} else {
				ch = input.charAt(i - 1);
				if (ch == 'z') {
					ch = 'a';
				} else {
					val = ch + 1;
					ch = (char) val;
				}
				output += ch;

			}

		}

		System.out.println(output);

	}

}
