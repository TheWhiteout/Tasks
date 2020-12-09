import java.util.Arrays;
import java.util.List;

public class Movie {
	String name;
	Director director;
	double rating;
	List<Role> roles;

	Movie(String name1, Actor actor1, String name2, Actor actor2) {
		roles = Arrays.asList(new Role(this, name1, actor1), new Role(this, name2, actor2));
	}
}
