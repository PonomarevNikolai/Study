package Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите номер задания 1-6:");
        Scanner scan = new Scanner(System.in);
        int task= scan.nextInt();

        switch (task) {
            case 1: Task1();break;
            case 2: Task2();break;
            case 3: Task3();break;
            case 4: Task4();break;
            case 5: Task5();break;
            case 6: Task6();break;
        }
    }

    private static void Task1() {
        System.out.println("Я"+"\n"+"хорошо"+"\n"+"знаю"+"\n"+"Java.");
    }
    private static void Task2() {
        System.out.println((46+10)*(10/3));
    }
    private static void Task3() {
        short number=10500;
        System.out.println((number/10)/10);
    }
    private static void Task4() {
        double num1=3.6;
        double num2=4.1;
        double num3=5.9;
        System.out.println(num1*num2*num3);
    }
    private static void Task5() throws IOException {
        System.out.println("Введите числа:");
        String allNums = "";
        String numbers;
        do {
            numbers="";
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            numbers = reader.readLine();
            allNums=allNums+" "+numbers;
        } while (!numbers.isEmpty());
        System.out.println("Ввывод введеных чисел:");
        String[] num = allNums.split("\\s");
        for(String cut:num) {
            System.out.println(cut);
        }
    }

    private static void Task6() throws IOException {
        System.out.println("Введите целое число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        Integer num= Integer.parseInt(number);
        int flag=num%2;
        if(flag>0){
            System.out.println("Число не четное");
        } else if(num>100){
            System.out.println("Выход за пределы диапазона");
        }else System.out.println("Число четное");
    }
}
