package Lesson9;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayAndLinked {
    public static String arrayAndLinked() {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        fillList(arrayList);
        fillList(linkedList);
        Instant start = Instant.now();
        System.out.println("Начало поиска в ArrayList");
        findResult(arrayList);
        System.out.println("Конец поиска в ArrayList");
        Instant stop = Instant.now();
        Long arrayListTime = Duration.between(start, stop).toMillis();
        start = Instant.now();
        System.out.println("Начало поиска в LinkedList");
        findResult(linkedList);
        System.out.println("Конец поиска в LinkedList");
        stop = Instant.now();
        Long linkedListTime = Duration.between(start, stop).toMillis();

        return "Поиск в ArrayList занял " + arrayListTime + " мс.\n" + "Поиск в LinkedList занял " + linkedListTime + " мс.\n";
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
    }

    private static void findResult(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            Random random = new Random();
            list.contains(random.nextInt(100000));
        }
    }
}
