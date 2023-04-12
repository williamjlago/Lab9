import java.util.*;
public class MovieList {
	public static void main(String[] args) {
		Map<String, Set<String>> studentPreferences = new HashMap<>();
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
		List<String> testCase1 = Arrays.asList("Abbas", "Thomas", "Seth");
		String expectedResult1 = "Braveheart";
		List<String> testCase2 = Arrays.asList("Liban", "Jonathan", "Megan");
		String expectedResult2 = "Joker";
		List<String> testCase3 = Arrays.asList("Benjamin", "Anusha", "Jimmy", "Nikki");
		String expectedResult3 = "Scarface";
		List<String> testCase4 = Arrays.asList("Kyrin", "William", "Ahmad", "Esther");
		String expectedResult4 = "The Shining";
		List<String> testCase5 = Arrays.asList("Dylan", "Thomas", "Thad");
		String expectedResult5 = "Fight Club";
		List<String> testCase6 = Arrays.asList("Jonathan", "Megan", "Jimmy", "William");
		String expectedResult6 = "Inception";
		List<String> testCase7 = Arrays.asList("Abbas", "Nikki", "Kyrin");
		String expectedResult7 = "Room";
		List<String> testCase8 = Arrays.asList("Liban", "Anusha", "Seth", "Dylan");
		String expectedResult8 = "The Godfather";
		List<String> testCase9 = Arrays.asList("Esther", "Thomas", "Ahmad");
		String expectedResult9 = "The Shining";
		List<String> testCase10 = Arrays.asList("Liban", "Jonathan", "Esther");
		String expectedResult10 = "Pulp Fiction";
		int correctResults = 0;
		if (testMovieSelection(studentPreferences, testCase1, expectedResult1)) correctResults++;
		if (testMovieSelection(studentPreferences, testCase2, expectedResult2)) correctResults++;
		if (testMovieSelection(studentPreferences, testCase3, expectedResult3)) correctResults++;
		if (testMovieSelection(studentPreferences, testCase4, expectedResult4)) correctResults++;
		if (testMovieSelection(studentPreferences, testCase5, expectedResult5)) correctResults++;
		if (testMovieSelection(studentPreferences, testCase6, expectedResult6)) correctResults++;
		if (testMovieSelection(studentPreferences, testCase7, expectedResult7)) correctResults++;
		if (testMovieSelection(studentPreferences, testCase8, expectedResult8)) correctResults++;
		if (testMovieSelection(studentPreferences, testCase9, expectedResult9)) correctResults++;
		if (testMovieSelection(studentPreferences, testCase10, expectedResult10)) correctResults++;
		System.out.println("Correct results: " + correctResults + " out of 10");
	}
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
	}}
