
public class Student extends Person {
	static final int FRESHMAN = 1;
	static final int SOPHOMORE = 2;
	static final int JUNIOR = 3;
	static final int SENIOR = 4;
	private int classStatus;

	Student(String name, String address, String phoneNumber, String email, int classStatus) {
		super(name, address, phoneNumber, email);
		setClassStatus(classStatus);
	}

	public int getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(int classStatus) {
		this.classStatus = classStatus;
	}

	public String toString() {
		return super.toString() + "\n" + classStatus;
	}
}
