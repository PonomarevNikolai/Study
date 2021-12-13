package Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;

public class Map {
    public static void gameStart() {
        HashMap<String, Integer> gameMap = new HashMap<String, Integer>();
        fillGamers(gameMap);
        System.out.println("Счет какого игрока хотите узнать:" + "\n");
        System.out.println(getScore(gameMap));
    }

    private static void fillGamers(HashMap<String, Integer> map) {
        Integer gamers = 0;
        String name = "";
        Random random = new Random();
        System.out.println("Сколько игроков играет?");
        gamers = Integer.parseInt(getInfo());
        for (int i = 0; i < gamers; i++) {
            System.out.println("Введите имя Игрока " + (i + 1) + " :");
            name = getInfo();
            map.put(name, random.nextInt(10000));

        }
    }

    private static String getInfo() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String info = "";
        try {
            info = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return info;
    }

    private static String getScore(HashMap map) {
        int score = -1;
        boolean result = true;
        String name = "";

        do {
            name = getInfo();

            if (map.get(name) != null) {
                score = (int) map.get(name);
                result = false;
            } else {
                System.out.println("Такого игрока нет, попробуйте еще раз: ");
            }
        } while (result);
        return "\n" + "Результат Игрока " + name + ": " + score + " очков.";
    }
}
