import java.util.*;
public class MovieList {
	
	public static String findMovieToWatch(Map<String, Set<String>> studentPreferences, List<String> students) {
		
		Map<String, Integer> movieOccurrences = new HashMap<>();
		
		for (String student : students) {
			Set<String> preferences = studentPreferences.get(student);
			for (String movie : preferences) {
				movieOccurrences.put(movie, movieOccurrences.getOrDefault(movie, 0) + 1);
			}
		}
		
		List<String> maxMovies = new ArrayList<>();
		int maxCount = 0;
		for (Map.Entry<String, Integer> entry : movieOccurrences.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxMovies.clear();
				maxMovies.add(entry.getKey());
				maxCount = entry.getValue();
			} else if (entry.getValue() == maxCount) {
				maxMovies.add(entry.getKey());
			}
		}
		
		Random random = new Random();
		return maxMovies.get(random.nextInt(maxMovies.size()));
	}
	
	public static boolean testMovieSelection(Map<String, Set<String>> studentPreferences, List<String> students, String expectedResult) {
		String result = findMovieToWatch(studentPreferences, students);
		System.out.println("Test case: " + students + " - Expected result: " + expectedResult + " - Actual result: " + result);
		return result.equals(expectedResult);
	}
	
	public static void main(String[] args) {
		
		Map<String, Set<String>> studentPreferences = new HashMap<>();
		int correctResults = 0;
		
		studentPreferences.put("Liban", Set.of("The Godfather", "Pulp Fiction", "Forrest Gump", "The Shining", "Joker"));
		studentPreferences.put("Jonathan", Set.of("Pulp Fiction", "Gladiator", "Joker", "A Separation", "Inception"));
		studentPreferences.put("Megan", Set.of("Fight Club", "Forrest Gump", "Joker", "Inception", "M"));
		studentPreferences.put("Benjamin", Set.of("Pulp Fiction", "Fight Club", "Scarface", "A Separation", "Full Metal Jacket"));
		studentPreferences.put("Anusha", Set.of("The Godfather", "Scarface", "A Separation", "Taxi Driver", "Die Hard"));
		studentPreferences.put("Jimmy", Set.of("Forrest Gump", "The Shining", "Braveheart", "Inception", "Jaws"));
		studentPreferences.put("Nikki", Set.of("Gladiator", "Scarface", "Shutter Island", "M", "The Terminator"));
		studentPreferences.put("Abbas", Set.of("Pulp Fiction", "Braveheart", "A Separation", "The Exorcist", "Room"));
		studentPreferences.put("Kyrin", Set.of("Forrest Gump", "The Shining", "Shutter Island", "Room", "Die Hard"));
		studentPreferences.put("William", Set.of("The Godfather", "Braveheart", "Inception", "Die Hard", "Jaws"));
		studentPreferences.put("Ahmad", Set.of("Gladiator", "The Shining", "Shutter Island", "Joker", "M"));
		studentPreferences.put("Esther", Set.of("Pulp Fiction", "The Shining", "M", "Die Hard", "Jaws"));
		studentPreferences.put("Dylan", Set.of("Pulp Fiction", "Fight Club", "The Shining", "The Terminator", "Room"));
		studentPreferences.put("Thomas", Set.of("Forrest Gump", "Braveheart", "Shutter Island", "Inception", "The Exorcist"));
		studentPreferences.put("Thad", Set.of("Fight Club", "The Shining", "A Separation", "Die Hard", "The Terminator"));
		studentPreferences.put("Seth", Set.of("The Godfather", "Braveheart", "Shutter Island", "Inception", "M"));
		
		List<String>[] testCases = new List[10];
		String[] expectedResults = new String[10];
		
		testCases[0] = Arrays.asList("Abbas", "Thomas", "Seth");
		expectedResults[0] = "Braveheart";
		testCases[1] = Arrays.asList("Liban", "Jonathan", "Megan");
		expectedResults[1] = "Joker";
		testCases[2] = Arrays.asList("Benjamin", "Anusha", "Jimmy", "Nikki");
		expectedResults[2] = "Scarface";
		testCases[3] = Arrays.asList("Kyrin", "William", "Ahmad", "Esther");
		expectedResults[3] = "The Shining";
		testCases[4] = Arrays.asList("Dylan", "Thomas", "Thad");
		expectedResults[4] = "Fight Club";
		testCases[5] = Arrays.asList("Jonathan", "Megan", "Jimmy", "William");
		expectedResults[5] = "Inception";
		testCases[6] = Arrays.asList("Abbas", "Nikki", "Kyrin");
		expectedResults[6] = "Room";
		testCases[7] = Arrays.asList("Liban", "Anusha", "Seth", "Dylan");
		expectedResults[7] = "The Godfather";
		testCases[8] = Arrays.asList("Esther", "Thomas", "Ahmad");
		expectedResults[8] = "The Shining";
		testCases[9] = Arrays.asList("Liban", "Jonathan", "Esther");
		expectedResults[9] = "Pulp Fiction";
				
		for (int i = 0; i < 10; i++) {
			if (testMovieSelection(studentPreferences, testCases[i], expectedResults[i])) {
				correctResults++;
			}
		}
		System.out.println("Correct results: " + correctResults + " out of 10");	
	}
}
