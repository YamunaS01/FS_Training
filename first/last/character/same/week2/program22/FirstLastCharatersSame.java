package first.last.character.same.week2.program22;

public class FirstLastCharatersSame {

	public static void main(String[] args) {

		FirstLastCharatersSame value = new FirstLastCharatersSame();

		value.character("world is beautifulw");

	}

	public void character(String input) {

		String word = input;
		
		word.toLowerCase();

		if (word.charAt(0) == word.charAt(word.length() - 1)) {
			System.out.println("First and Last Characters are same : Output = 1");

		} else {
			System.out.println("First and Last Charaters are not same : Output = -1");
		}
	}
}
