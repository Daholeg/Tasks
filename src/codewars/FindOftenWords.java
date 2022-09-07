package codewars;

import java.util.*;

public class FindOftenWords {
    public static void main(String[] args) {
//            Return a list of words in descending order of frequency.
//            Example:
//            "the", "day", "is", "sunny", "the", "day", "is", "the", "day", "the".
//            THE meets 4 times
//            DAY meets 3 times
//            IS meets 2 times
//            SUNNY meets once
//            Result:
//            the day is sunny

        List<String> words = List.of("the", "day", "is", "sunny", "the", "day", "is",
                "the", "day", "the");
        getSortedArrayByWords(words);
    }

    public static void getSortedArrayByWords(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        int frequency;

        for (int i = 0; i < list.size(); i++) {
            frequency = Collections.frequency(list, list.get(i));
            map.put(list.get(i), frequency);
        }

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(s -> System.out.print(s.getKey() + " "));
    }
}

