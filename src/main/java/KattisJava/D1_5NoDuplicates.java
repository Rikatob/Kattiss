package KattisJava;

import java.util.*;

public class D1_5NoDuplicates {

    public static void main(String[] args) {

        boolean duplicateFound = false;
        double start = 0;
        double end = 0;
        double result = 0;

        Scanner s = new Scanner(System.in);

        // Scan the input and put the words in an array by splitting on " ".
        String input = s.nextLine();

        String[] sentence = input.toLowerCase().split(" ");

        start = System.nanoTime();

        /**
         * With for Set!
         *
         */

       /* Set<String> wordSet = new HashSet<>();

        Collections.addAll(wordSet, sentence);

        if (wordSet.size() < sentence.length) {
            duplicateFound = true;
        }*/


        /**
         * With HashMap!
         *
         */

        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : sentence) {
            if (wordMap.containsKey(word)) {
                duplicateFound = true;
                break;
            } else {
                wordMap.put(word, 1);
            }
        }


        /**
         * With for loop!
         *
         */


        // Loop through every word and check if there are duplicates
        // break outer loop if duplicate is found
        /*iFor:
        for (int i = 0; i < sentence.length; i++) {
            for (int j = i + 1; j < sentence.length ; j++) {
                if (sentence[i].equals(sentence[j])) {
                    duplicateFound = true;
                    break iFor;
                }
            }

        }*/

        System.out.println(duplicateFound ? "no" : "yes");


        end = System.nanoTime();
        result = end - start;
        System.out.println("Result is: " + result);
    }
}
