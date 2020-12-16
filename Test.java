import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Person person = new Person("name", "address", "phone number", "email");
		Student student = new Student("name", "address", "phone number", "email", Student.JUNIOR);
		Employee employee = new Employee("name", "address", "phone number", "email", "office", 1000, new Date());
		Faculty faculty = new Faculty("name", "address", "phone number", "email", "office", 1000, new Date(), 40,
				"rank");
		Staff staff = new Staff("name", "address", "phone number", "email", "office", 1000, new Date(), "title");
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());

	}

}
