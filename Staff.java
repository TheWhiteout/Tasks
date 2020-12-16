import java.util.Date;

public class Staff extends Employee {
	private String title;

	Staff(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired,
			String title) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return super.toString() + "\n" + title;
	}
}
