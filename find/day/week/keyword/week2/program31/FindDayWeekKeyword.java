package find.day.week.keyword.week2.program31;

import java.util.Scanner;

public class FindDayWeekKeyword {

	public static void main(String[] args) {

		String[] day = new String[7];

		day[0] = "Sun";

		day[1] = "Mon";

		day[2] = "Tue";

		day[3] = "Wed";

		day[4] = "Thu";

		day[5] = "Fri";

		day[6] = "Sat";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value  : ");

		int value = sc.nextInt();

		if (value == 1) {
			System.out.println("Day of the Week  :  " + day[0]);
		} else if (value == 2) {
			System.out.println("Day of the Week  :  " + day[1]);

		} else if (value == 3) {
			System.out.println("Day of the Week  :  " + day[2]);

		} else if (value == 4) {
			System.out.println("Day of the Week  :  " + day[3]);

		} else if (value == 5) {
			System.out.println("Day of the Week  :  " + day[4]);

		} else

		if (value == 6) {
			System.out.println("Day of the Week  :  " + day[5]);

		} else if (value == 7) {
			System.out.println("Day of the Week  :  " + day[6]);
		}
		sc.close();

	}

}
