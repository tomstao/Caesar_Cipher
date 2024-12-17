import edu.duke.FileResource;

import java.io.File;

public class WordLength {

    public static void countWordLength(FileResource resource, int[] counts) {

        for (String word : resource.words()) {
            int wordLength = word.length();
            word = word.toUpperCase();
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            boolean firstLetter = alphabet.contains(word.substring(0, 1));
            boolean lastLetter = alphabet.contains(word.substring(wordLength - 1, wordLength));

            if (!firstLetter && !lastLetter) {
                wordLength = wordLength - 2;
            } else if (!firstLetter || !lastLetter) {
                wordLength = wordLength - 1;
            }

            if (wordLength >= 30) {
                counts[30]++;
            } else {
                counts[wordLength]++;
            }

        }
    }



}
