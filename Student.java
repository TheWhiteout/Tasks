
public class Student {
	private String name;
	private double averageScore;

	public Student() {
	}

	public Student(String newName, double newAverageScore) {
		name = newName;
		averageScore = newAverageScore;
	}

	void setName(String newName) {
		name = newName;
	}

	void setAverageScore(double newAverageScore) {
		averageScore = newAverageScore;
	}

	String getName() {
		return name;
	}

	double getAverageScore() {
		return averageScore;
	}
}
