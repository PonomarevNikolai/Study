package Lesson6.Parent2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        try {
            child.setName();
        } catch (IOException e) {
            e.printStackTrace();
        }
        child.setYears();
        child.outPut();
    }
}
