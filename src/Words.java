

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.HashMap;



public class Words {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            int wordCount = 0;

            Scanner scanner1 = new Scanner(file);
            String longestWord = "";

            Scanner scanner2 = new Scanner(file);
            Map<String, Integer> wordFrequency = new HashMap<>();


            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }

            while (scanner1.hasNext()) {
                String word = scanner1.next();
                if (word.length() > longestWord.length()){
                    longestWord = word;
                }
            }
            while (scanner2.hasNext()) {
                String word = scanner2.next();
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }

            System.out.println("Total words in the file: " + wordCount);
            System.out.println("Longest word in the file: " + longestWord);
            wordFrequency.forEach((word, frequency) -> System.out.println(word + " - " + frequency + " times"));

        } catch (FileNotFoundException e) {
            System.err.println("Field not found.");
        }
    }
}
