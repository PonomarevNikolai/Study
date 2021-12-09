package Lesson6.Parent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parent {
    public int inputNumber() {
        System.out.println("Enter number: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer num = 0;
        try {
            num = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return num;

    }

}
