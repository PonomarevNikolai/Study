package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("====================");
        for (int i = 1; i < 100; i++) {
            if (i % 2 > 0) System.out.println(i);
        }
        System.out.println("====================");
        System.out.println("Задание 2");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("Делится на 3 и на 5: " + i);
                    continue;
                } else System.out.println("Делится на 3: " + i);
            }
            if (i % 5 == 0) {
                System.out.println("Делится на  5: " + i);
            }

        }
        System.out.println("====================");
        System.out.println("Задание 3");

        System.out.print("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Integer firstNum = Integer.parseInt(s);
        System.out.print("Введите второе число:");
        s = scanner.nextLine();
        Integer secondNum = Integer.parseInt(s);
        System.out.print("Введите третье число:");
        s = scanner.nextLine();
        Integer thirdNum = Integer.parseInt(s);
        boolean b = false;
        b = (thirdNum == firstNum + secondNum);
        System.out.println(b);

        System.out.println("====================");
        System.out.println("Задание 4");

        System.out.print("Введите первое число:");
        s = scanner.nextLine();
        Integer firstNum1 = Integer.parseInt(s);
        System.out.print("Введите второе число:");
        s = scanner.nextLine();
        Integer secondNum1 = Integer.parseInt(s);
        System.out.print("Введите третье число:");
        s = scanner.nextLine();
        Integer thirdNum1 = Integer.parseInt(s);
        boolean b1 = false;
        b1 = (firstNum1 < secondNum1 && secondNum1 < thirdNum1);
        System.out.println(b1);

        System.out.println("====================");
        System.out.println("Задание 5");

        int[] array = new int[7];

        for (int i=0; i< array.length;i++) {
            System.out.print("Введите значение array["+i+"] число:");
            s = scanner.nextLine();
            array[i] = Integer.parseInt(s);
        }
        boolean b3 = false;
        System.out.println(Arrays.toString(array));
        b3 = (array[0] == 3 || array[6] == 3);
        System.out.println(b3);

        System.out.println("====================");
        System.out.println("Задание 6");

        boolean mark=true;

        for (int i=0; i< array.length;i++) {
            int some=array[i];
            if (some == 1) {
                System.out.println("Массив содержит 1");
                mark=false;
                break;
            }
            if (some == 3) {
                System.out.println("Массив содержит 3");
                mark=false;
                break;
            }
        }
        if (mark) System.out.println("Массив не содержит 1 и 3");


    }
}
