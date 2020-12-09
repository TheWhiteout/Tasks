import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Director scorsese = new Director();
		scorsese.name = "Martin Scorsese";
		Actor dicaprio = new Actor();
		dicaprio.name = "Leonardo DiCaprio";
		Actor damon = new Actor();
		damon.name = "Matt Damon";
		Movie departed = new Movie("Billy Costigan", dicaprio, "Colin Sullivan", damon);
		departed.name = "The Departed";
		departed.rating = 8.5;
		Actor robert = new Actor();
		robert.name = "Robert De Niro";
		Actor liotta = new Actor();
		liotta.name = "Ray Liotta";
		Movie goodfellas = new Movie("James Conway", robert, "Henry Hill", liotta);
		goodfellas.name = "Goodfellas";
		goodfellas.rating = 8.7;
		scorsese.movies = Arrays.asList(departed, goodfellas);
		Director wright = new Director();
		wright.name = "Edgar Wright";
		Actor pegg = new Actor();
		pegg.name = "Simon Pegg";
		Actor frost = new Actor();
		frost.name = "Nick Frost";
		Movie fuzz = new Movie("Nicholas Angel", pegg, "Danny Butterman", frost);
		fuzz.name = "Hot Fuzz";
		fuzz.rating = 7.8;
		Movie shaun = new Movie("Shaun", pegg, "Ed", frost);
		shaun.name = "Shaun of the Dead";
		shaun.rating = 7.9;
		wright.movies = Arrays.asList(fuzz, shaun);
		System.out.println("Movies of: " + scorsese.name);
		System.out.println();
		for (Movie movie : scorsese.movies) {
			System.out.println(movie.name + " " + movie.rating);
			System.out.println("Starring:");
			for (Role role : movie.roles) {
				System.out.println(role.actor.name + " as " + role.name);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Movies of: " + wright.name);
		System.out.println();
		for (Movie movie : wright.movies) {
			System.out.println(movie.name + " " + movie.rating);
			System.out.println("Starring:");
			for (Role role : movie.roles) {
				System.out.println(role.actor.name + " as " + role.name);
			}
			System.out.println();
		}
	}

}
