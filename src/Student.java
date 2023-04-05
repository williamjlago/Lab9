package lab8;
import java.util.*;

public class Student {
	
	String name;
	TreeSet<String> favoriteMovies = new TreeSet<String>();
	
	public Student(String n, String[] favorites) {
		name = n;
		for (String movie : favorites) {
			favoriteMovies.add(movie);
		}
	}

}
