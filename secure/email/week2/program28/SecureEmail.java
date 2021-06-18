package secure.email.week2.program28;

import java.util.Scanner;

public class SecureEmail {

	public static void main(String[] args) {

		String emailId;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Emai ID :  ");

		emailId = sc.next();

		if (emailId.startsWith("https")) {

			System.out.println("Entered e-mail ID  " + emailId + "  starts with https ");
		} else {
			System.out.println("Entered e-mail ID  " + emailId + "  does not starts with https ");

		}
		sc.close();
	}
}
