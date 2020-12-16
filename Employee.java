import java.util.Date;

public class Employee extends Person {
	private String office;
	private double salary;
	private Date dateHired;

	Employee(String name, String address, String phoneNumber, String email, String office, double salary,
			Date dateHired) {
		super(name, address, phoneNumber, email);
		setOffice(office);
		setSalary(salary);
		setDateHired(dateHired);
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	public String toString() {
		return super.toString() + "\n" + office + "\n" + salary + "\n" + dateHired.toString();
	}
}
