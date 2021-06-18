package replace.old.company.name.week2.program29;

public class ReplaceOldCompanyName {

	public static void main(String[] args) {

		String oldCompanyName = "Apple Private Limited";

		System.out.println("The Old company Name is  :  " + oldCompanyName);

		String replaceValue = "Cherry";

		String newCompanyName;

		newCompanyName = oldCompanyName;

		newCompanyName = oldCompanyName.replace("Apple", replaceValue);

		System.out.println("The New company Name is  :  " + newCompanyName);

	}

}
