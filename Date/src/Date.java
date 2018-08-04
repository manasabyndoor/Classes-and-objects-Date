import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Date {

	private Calendar dob;
	// private int d,m,y;
	private int age;
	private int month;
	private int day;

	public Date(Calendar dob) {
		super();
		this.dob = dob;

	}

	//function to get the age
	public void getAge(Calendar dob) {
		Calendar today = Calendar.getInstance();
		int curYear = today.get(Calendar.YEAR);
		int dobYear = dob.get(Calendar.YEAR);
		this.age = curYear - dobYear;

		int curMonth = today.get(Calendar.MONTH);
		int dobMonth = dob.get(Calendar.MONTH);
		this.month = dobMonth - curMonth;
		int curDay = today.get(Calendar.DAY_OF_MONTH);
		int dobDay = dob.get(Calendar.DAY_OF_MONTH);
		this.day = curDay - dobDay;
		if (dobMonth > curMonth) {
			this.age--;
		} else if (dobMonth == curMonth) {
			if (dobDay > curDay) {
				this.age--;
			}
		}
	}

	// returns the age
	public int getAge() {
		return age;
	}

	// returns the month
	public int getMonth() {
		return month;
	}

	// returns day
	public int getDay() {
		return day;
	}
}
