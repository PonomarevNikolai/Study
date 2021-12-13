package Lesson9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dublicate {
    public static void dublicate() {
        List<Integer> list = new ArrayList<>();
        fillList(list);
        System.out.println(list);
        System.out.println(cleanDublicate(list));
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
            list.add(i);
        }
    }

    private static Set<Integer> cleanDublicate(List<Integer> list) {
        Set<Integer> ints = new HashSet<>();
        for (int i : list) {
            ints.add(i);
        }
        return ints;
    }
}
