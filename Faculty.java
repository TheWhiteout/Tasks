import java.util.Date;

public class Faculty extends Employee {
	private int officeHours;
	private String rank;

	Faculty(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired,
			int officeHours, String rank) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		setOfficeHours(officeHours);
		setRank(rank);

	}

	public int getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String toString() {
		return super.toString() + "\n" + officeHours + "\n" + rank;
	}
}
