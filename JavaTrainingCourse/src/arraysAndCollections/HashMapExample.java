package arraysAndCollections;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> cities = new HashMap<>();
        cities.put(3, "cairo");
        cities.put(10, "alexandria");
        cities.put(18, "luxor");
        cities.put(7, "hurghada");

        System.out.println(cities.get(18));

        HashMap<String, String> languages = new HashMap<>();
        languages.put("en", "English");
        languages.put("ar", "Arabic");
        languages.put("fr", "French");

        System.out.println(languages.get("ar"));

    }
}
