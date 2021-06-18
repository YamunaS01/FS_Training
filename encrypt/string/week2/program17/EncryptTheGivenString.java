package encrypt.string.week2.program17;

import java.util.Scanner;

public class EncryptTheGivenString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the word:   ");

		String word = sc.nextLine();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < word.length(); i++) {
			int f = 0;

			if (i % 2 != 0) {
				f = 1;
				sb.append(word.charAt(i));

			}

			if (f == 0) {
				if (word.charAt(i) == 'z') {
					sb.append('a');
				} else {
					sb.append((char) (word.charAt(i) + 1));// Increment to next character +1

				}
			}

		}

		String encryptedWord = sb.toString();

		System.out.println("Encrypted Output:  " + encryptedWord);

		sc.close();

	}
}
