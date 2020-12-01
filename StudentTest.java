import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String newName;
		double newAverageScore;
		Student[] students = new Student[5];
		for (int i = 0; i < 5; i++) {
			newName = input.nextLine();
			newAverageScore = input.nextDouble();
			input.nextLine();
			students[i] = new Student(newName, newAverageScore);
		}
		goodStudents(students);
	}

	public static boolean scholarship(Student student) {
		if (student.getAverageScore() >= 5.5) {
			return true;
		}
		return false;
	}

	public static void goodStudents(Student[] students) {
		for (int i = 0; i < 5; i++) {
			if (scholarship(students[i])) {
				System.out.println(students[i].getName());
			}
		}
	}
}
