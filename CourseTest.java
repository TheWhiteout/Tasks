
public class CourseTest {

	public static void main(String[] args) {
		Course course1 = new Course("Organ playing");
		Course course2 = new Course("Remixing");
		course1.addStudent("Billy Costigan");
		course1.addStudent("Calvin Candie");
		course1.addStudent("Dominick Cobb");
		course1.addStudent("Danny Archer");
		course2.addStudent("Donnie Darko");
		course2.addStudent("Tyler Durden");
		course2.addStudent("Mark Renton");
		String[] students1;
		String[] students2;
		System.out.println(course1.getCourseName());
		System.out.println(course1.getNumberOfStudents());
		students1 = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.println(students1[i]);
		}
		course1.dropStudent("Billy Costigan");
		System.out.println(course1.getNumberOfStudents());
		students1 = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.println(students1[i]);
		}
		System.out.println();
		System.out.println(course2.getCourseName());
		System.out.println(course2.getNumberOfStudents());
		students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++) {
			System.out.println(students2[i]);
		}
		course2.dropStudent("Tyler Durden");
		System.out.println(course2.getNumberOfStudents());
		students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++) {
			System.out.println(students2[i]);
		}
		course2.addStudent("Tyler Durden");
		System.out.println(course2.getNumberOfStudents());
		students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++) {
			System.out.println(students2[i]);
		}
	}

}
