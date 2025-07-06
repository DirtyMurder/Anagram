import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

    public class Main {
        public static void main(String[] args) {
            String filePath = "sample.txt";
            ArrayList <String> list=  new ArrayList<>(10);
            try (BufferedReader reader = new BufferedReader (new FileReader(filePath))) {
                for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                    list.add(line);
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
                return;}

            Map<String , List<String>> groups = new HashMap<>();
            for (String word : list) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String key = new String (chars);

                groups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            }
            for (List<String> group : groups.values()) {
                if(group.size() > 1) {
                    System.out.println(group);
                }
            }

        }
    }
