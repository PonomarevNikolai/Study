package Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;

public class MapClass {
    public static void gameStart() {
        HashMap<User, Integer> gameMap = new HashMap<>();
        fillGamers(gameMap);
        System.out.println(getScore(gameMap));
    }

    private static void fillGamers(HashMap<User, Integer> map) {
        Integer gamers = 0;
        String name = "";
        Random random = new Random();
        System.out.println("Сколько игроков играет?");
        gamers = Integer.parseInt(getInfo());
        for (int i = 0; i < gamers; i++) {
            System.out.println("Введите имя Игрока " + (i + 1) + " :");
            name = getInfo();
             map.put(new User(name), random.nextInt(10000));

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

    private static String getScore(HashMap<User,Integer> map) {
        System.out.println("Счет какого игрока хотите узнать:");
        int score = -1;
        boolean result = false;
        String name = "";
        name=getInfo();
        for(User entry: map.keySet()){
            if(entry.getName().equals(name)){
                score= map.get(entry);
                break;

            }
        }


        return "\n" + "Результат Игрока " + name + ": " + score + " очков.";
    }
}
