
import java.util.Scanner;
import java.util.Calendar;
//import java.util.Date;
import java.text.SimpleDateFormat;

public class DatesTestClass {
	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date of birth in DD/MM/YYYY format");
	//reads the input from user
		String input = scanner.nextLine();
		scanner.close();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar dob = Calendar.getInstance();
		dob.setTime(sdf.parse(input));
		Date Age = new Date(dob);
		Age.getAge(dob);

		System.out.println("Age of the person is:" + Age.getAge() + "years" + Age.getMonth() + "months" + Age.getDay()
				+ "days old");

	}

}
