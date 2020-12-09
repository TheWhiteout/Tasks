
public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		setCourseName(courseName);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i] == student) {
				for (int j = i + 1; j < numberOfStudents; j++) {
					if (j != 100) {
						students[j - 1] = students[j];
					} else {
						students[j - 1] = null;
					}
				}
				break;
			}
		}
		numberOfStudents--;
	}

}
