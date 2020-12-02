package arraysAndCollections;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(3);
        integerHashSet.add(3);
        integerHashSet.add(4);
        integerHashSet.add(5);
        System.out.println(integerHashSet);
    }
}
