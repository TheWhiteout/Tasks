
public class Role {
	String name;
	Movie movie;
	Actor actor;

	Role(Movie movie, String name, Actor actor) {
		this.movie = movie;
		this.name = name;
		this.actor = actor;
	}
}
