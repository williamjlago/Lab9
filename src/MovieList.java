package lab8;
import java.util.*;




	public class MovieList {
	    public static void main(String[] args) {
	        Map<String, Set<String>> preferences = new HashMap<>();
	        preferences.put("Liban", Set.of("The Godfather", "Pulp Fiction", "Forrest Gump", "The Shining", "Joker"));
	        preferences.put("Jonathan", Set.of("Pulp Fiction", "Gladiator", "Joker", "A Separation", "Inception"));
	        preferences.put("Megan", Set.of("Fight Club", "Forrest Gump", "Joker", "Inception", "M"));
	        preferences.put("Benjamin", Set.of("Pulp Fiction", "Fight Club", "Scarface", "A Separation", "Full Metal Jacket"));
	        preferences.put("Anusha", Set.of("The Godfather", "Scarface", "A Separation", "Taxi Driver", "Die Hard"));
	        preferences.put("Jimmy", Set.of("Forrest Gump", "The Shining", "Braveheart", "Inception", "Jaws"));
	        preferences.put("Nikki", Set.of("Gladiator", "Scarface", "Shutter Island", "M", "The Terminator"));
	        preferences.put("Abbas", Set.of("Pulp Fiction", "Braveheart", "A Separation", "The Exorcist", "Room"));
	        preferences.put("Kyrin", Set.of("Forrest Gump", "The Shining", "Shutter Island", "Room", "Die Hard"));
	        preferences.put("William", Set.of("The Godfather", "Braveheart", "Inception", "Die Hard", "Jaws"));
	        preferences.put("Ahmad", Set.of("Gladiator", "The Shining", "Shutter Island", "Joker", "M"));
	        preferences.put("Esther", Set.of("Pulp Fiction", "The Shining", "M", "Die Hard", "Jaws"));
	        preferences.put("Dylan", Set.of("Pulp Fiction", "Fight Club", "The Shining", "The Terminator", "Room"));
	        preferences.put("Thomas", Set.of("Forrest Gump", "Braveheart", "Shutter Island", "Inception", "The Exorcist"));
	        preferences.put("Thad", Set.of("Fight Club", "The Shining", "A Separation", "Die Hard", "The Terminator"));
	        preferences.put("Seth", Set.of("The Godfather", "Braveheart", "Shutter Island", "Inception", "M"));
	        
	    }}
