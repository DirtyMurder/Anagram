```
# AnagramAnagram Finder
Description

This Java program reads words from a text file and groups them into sets of anagrams — words composed of the same letters in a different order.
Requirements
Java 8 or higher
IntelliJ IDEA or any other Java IDE
Input file named sample.txt placed in the root of the project

How to Run
Copy or download the project.
Place the sample.txt file in the root directory (next to Main.java).
Open the project in IntelliJ IDEA or any Java-compatible IDE.
Compile and run the program using:

javac Main.java
java Main

The output will be printed to the console.

Implementation Methodology
All words are read from the input file using BufferedReader.
Each word is converted into a character array, sorted alphabetically using Arrays.sort(), and converted back into a string to form a key.
Words are grouped using a HashMap<String, List<String>>, where the key is the sorted character string.
Groups of words sharing the same key are collected and printed as anagram groups.
This approach ensures that all words with identical character compositions, regardless of order, are placed in the same group.
Input Format

Each line of sample.txt contains one word, for example:

act
cat
tree
race
care
acre
bee

Expected Output

[act, cat]
[tree]
[acre, care, race]
[bee]

