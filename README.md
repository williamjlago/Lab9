Using a map of sets; keys will be students and each value will be a set of their favorite movies.
Tasks:

Create a data structure to store the movie preferences of each student
Determine the movie that the majority of students like
Break ties randomly
Data Structures:

A Map data structure to store the movie preferences of each student. Each key in the map will be a student's name and its corresponding value will be a Set of Strings containing the movies that the student likes.
A TreeMap data structure to count the occurrence of each movie in the students' preferences.
A List data structure to store the movies that have the highest count.
Algorithm:

Create an empty Map to store the movie preferences of each student.
For each student:
a. Create a Set of Strings to store the movies that the student likes.
b. Add the Set to the Map with the student's name as the key.
Create an empty TreeMap to store the count of each movie in the students' preferences.
For each student's preferences in the Map:
a. For each movie in the Set:
i. If the movie is already in the TreeMap, increment its count.
ii. Else, add the movie to the TreeMap with a count of 1.
Create an empty List to store the movies that have the highest count.
Determine the movie that the majority of students like:
a. Get the highest count from the TreeMap.
b. For each movie in the TreeMap:
i. If its count is equal to the highest count, add it to the List.
c. If the List contains only one movie, return it as the movie to watch.
d. Else, randomly select a movie from the List and return it as the movie to watch.
